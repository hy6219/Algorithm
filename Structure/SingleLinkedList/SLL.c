#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
/*
https://dojang.io/mod/page/view.php?id=408
구조체 변수 Node로 접근
*/
typedef struct  {
	int data;
	struct Node* next;
}Node;

/*노드 생성*/
Node* createNode(int d) {
	/*새로운 노드의 메모리 공간 할당*/
	Node* node = (Node*)malloc(sizeof(Node));
	node->data = d;
	node->next = NULL;

	return node;
}
//배열의 인덱스를 생각했을 때 index==0 즉, 
//기존의 헤드의 앞에 삽입될 수도 있기에!
void SLL_InsertNewHead(Node** Head, Node* NewHead)
{
	if (Head == NULL)
	{
		(*Head) = NewHead;
	}
	else
	{
		NewHead->next = (*Head);
		(*Head) = NewHead;//기존 헤드의 데이터와 새로 헤드가 될 노드의 주소포인터 잇기
	}
}
/*노드 추가*/
void insertNode(Node **Head, Node *ins) {
	/*헤드 노드가 빈 경우*/
	if ((*Head) == NULL) 
	{
		*Head = ins;
	}
	else
	{
		/*tail 노드 찾아서 연결하기*/
		Node* tail = *Head;

		while (tail->next != NULL)
		{
			/*tail 노드 반환*/
			tail = tail->next;
		}
		/*tail의 포인터는 새로운 노드를 가리켜야 함*/
		tail->next = ins;
	}
}
/*특정 위치 뒤에 노드 삽입*/
void insertAfter(Node* bef, Node* newNode)
{
	/*노드1-노드2 이렇게 있는데 이 사이에 삽입하게 될 경우,
	노드1의 포인터가 삽입될 노드를 가리켜야 함(2)
	삽입될 노드의 포인터는 노드2(bef->next)를 가리켜야 함(1)*/
	newNode->next = bef->next;
	bef->next = newNode;
}
/*노드 삭제*/
void  removeNode(Node** Head, Node* remove)
{
	/*
	 *A.제거할 노드가 헤드노드인 경우
	 1.새로운 헤드는 헤드노드의 다음 노드가 되기 
	 *B.제거할 노드가 헤드노드가 아닌 경우
	 노드1-노드2-노드3 이렇게 있고, 노드 2를 제거한다면
	 1.제거할 노드를 찾아서 보관(그래서 제거노드인 노드2를 담고,
	 노드 3을 가리킬 수 있는 노드 3을 위한 가상 노드가 필요함)->cur

	 2.cur의 다음 노드에 제거할 노드(remove)의 다음 주소를 저장하기
	 3.메모리 해제
	 */
	if (remove == *Head)
	{
		*Head = remove->next;
	}
	else
	{
		Node* cur = *Head;

		while (cur != NULL && cur->next != remove)
		{
			cur = cur->next;
		}
		if (cur != NULL)
		{
			cur->next = remove->next;
			
		}
	}
	free(remove);
}
/*노드 탐색*/
Node* searchNode(Node* Head, int pos)
{
	int k = 0;
	Node* cur = Head;
	while (k < pos && cur != NULL)
	{
		cur=cur->next;
		k++;
	}
	return cur;
}
/*노드 개수 세기*/
int countSLL(Node* Head)
{
	Node* cur = Head;
	int cnt = 0;
	while (cur != NULL)
	{
		cnt++;
		cur = cur->next;
	}
	return cnt;
}
/*모든 노드 출력*/
void printAll(Node* Head)
{
	Node* cur = Head;

	while (cur != NULL)
	{
		printf("%d\t", cur->data);
		cur = cur->next;
	}
	printf("\n");
}
int main() {
	Node* SLL = NULL;
	Node* temp = NULL;//삽입할 위치
	Node* ins = NULL;
	int num = 0;
	//1.노드 생성, 추가
	for (int i = 0; i < 5; i++)
	{
		ins = createNode(i);
		insertNode(&SLL, ins);
	}
	printf("Before: ");
	printAll(SLL);
	//2.노드 사이에 삽입
	//삽입할 위치 찾기
	temp = searchNode(SLL, 2);
	ins = createNode(3);
	insertAfter(temp, ins);
	printf("After1: ");
	printAll(SLL);
	//3.헤드 노드 앞에 삽입
	ins = createNode(0);
	SLL_InsertNewHead(&SLL, ins);
	printf("After2: ");
	printAll(SLL);
	//4.노드 개수 세기
	num = countSLL(SLL);
	printf("개수: %d\n", num);

	//5.제거
	temp = searchNode(SLL, 0);
	removeNode(&SLL, temp);
	printf("After3: ");
	printAll(SLL);

	//모든 노드 제거
	num = countSLL(SLL);
	for (int i = 0; i < num; i++)
	{
		temp = searchNode(SLL, 0);

		if (temp != NULL)
		{
			//지워지지 않은 노드라면 지우고 소멸시키기
			removeNode(&SLL, temp);
		}
	}
	printf("After4: ");
	printAll(SLL);
	printf("다 제거되었네!\n");
}

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head){
    if(head == NULL || head->next == NULL)return head;
    struct ListNode *p, *q, *temp;

    p = head;
    temp = p->next;
    q = temp->next;

    p->next = NULL;

    while(q != NULL)
    {
        temp->next = p;
        p = temp;
        temp = q;
        q = q->next;

    }

    temp->next = p;

    return temp;


}
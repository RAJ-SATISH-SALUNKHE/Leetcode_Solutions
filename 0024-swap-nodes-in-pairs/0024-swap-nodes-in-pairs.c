/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* swapPairs(struct ListNode* head){

    if(head == NULL || head->next == NULL)return head;
    struct ListNode *p, *q, *temp, *newHead;

    p = head;
    newHead = p->next;
    while(1)
    {
        q = p->next;
        temp = q->next;
        q->next = p;
        // if(temp == NULL || temp->next == NULL)
        // {
        //     p->next = NULL;
        //     break;
        // }
        if(temp == NULL)
        {
            p->next = NULL;
            break;
        }
        if(temp->next == NULL)
        {
            p->next = temp;
            break;
        }
        p->next = temp->next;
        p = temp;
    }

    return newHead;

}
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* oddEvenList(struct ListNode* head){

    if(head == NULL)return NULL;
    struct ListNode *p, *q, *temp, *x;
    temp = head;
    x = head->next;

    while(1)
    {

        if(temp == NULL)
        {
            p->next = x;
            break;
        }
        if(temp->next == NULL)
        {
            temp->next = x;
            break;
        }

        p = temp;
        q = p->next;
        temp = q->next;

        if(q->next != NULL)
        {
            p->next = temp;
            q->next = temp->next;
            // temp->next = q;   
        }

    }

    return head;

}
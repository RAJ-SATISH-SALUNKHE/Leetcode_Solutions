/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int i = 0;
struct ListNode* deleteMiddle(struct ListNode* head){

    int i = 0;
    struct ListNode *p = head;
    if(head == NULL || head->next == NULL)return NULL;
    while(p->next != NULL)
    {
        p = p->next;
        i++;
    }
    int threshold = (i%2 == 1)?i/2 : (i/2) - 1; 
    printf("threshold is %d\n", threshold);
    p = head;
    struct ListNode *q = p->next;
    i = 0;

    while(i != threshold)
    {
        p = q;
        q = q->next;
        i++;
    }

    if(q != NULL)
    {
        p->next = q->next;
        q->next = NULL;
        free(q);
    }


    return head;
}
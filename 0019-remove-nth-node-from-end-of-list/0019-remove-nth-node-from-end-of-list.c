/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int i = 0, j = 0, length = 0;
struct ListNode *newHead = NULL;

struct ListNode* removeNthFromEnd(struct ListNode* head, int n){
    if(j == 0)newHead = head;
    struct ListNode *p = head; j++;


     if(p->next == NULL)
     {
        i = 0;
        if(j == 1)
        {
            free(p);
            length = j;
            j = 0;
            return NULL;
        }
        length = j;
        j = 0;
         return p;
     }

     struct ListNode *q = removeNthFromEnd(p->next, n);
     i++;


    if(n == length && p == newHead)
    {
        p->next = NULL;
        free(p);
        newHead = NULL;
        return q; 
    }

     if(i == n)
     {
         p->next = q->next;
         q->next = NULL;
         free(q);
     }


    return p;
}
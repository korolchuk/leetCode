/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    let list = new ListNode(0);
    let head = list;
    let sumReverse = 0;
    let listStringReverse = '';
    let len = 0;
    sumReverse = BigInt(listNodeToReverseString(l1)) + BigInt(listNodeToReverseString(l2));
    listStringReverse = sumReverse.toString();
    len = listStringReverse.length;
    for(let i = len - 1; i >= 0; i--) {
        head.next = new ListNode(listStringReverse.charAt(i));
        head = head.next
    }
    return list.next;
};

function listNodeToReverseString(list) {
    let str = '';
    while(list !== null) {
        str = list.val + str;
        list = list.next;
    }
    return str;
} 



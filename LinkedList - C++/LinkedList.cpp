//*******************************************************************
//  LinkedList.cpp
//  LinkedList_Project
//
//  Created by Karlina Beringer on June 12, 2014.
//  This source file contains the LinkedList class definitions.
//*******************************************************************

#include "LinkedList.h"

// Default Constructor creates the head node.
LinkedList::LinkedList()
{
    head -> song = "head (contains no song data)";
    head -> artist = "head (contains no artist data)";
    head -> next = NULL;
    listLength = 0;
}

// Setter adds a node to the list at a given position.
// Takes a node and list position as parameters.
// Position must be between 1 and the number of data nodes.
// Returns true if the operation is successful.
bool LinkedList::insertNode( node * newNode, int position )
{
    if ((position <= 0) || (position > listLength + 1))
    {
        cout << "nError: the given position is out of range.n";
        return false;
    }
    if (head -> next == NULL)
    {
        head -> next = newNode;
        listLength++;
        return true;
    }
    int count = 0;
    node * p = head;
    node * q = head;
    while (q)
    {
        if (count == position)
        {
            p -> next = newNode;
            newNode -> next = q;
            listLength++;
            return true;
        }
        p = q;
        q = p -> next;
        count++;
    }
    if (count == position)
    {
        p -> next = newNode;
        newNode -> next = q;
        listLength++;
        return true;
    }
    cout << "nError: node was not added to list.n";
    return false;
}

// Setter removes a node by its given position.
// Returns true if the operation is successful.
bool LinkedList::removeNode( int position )
{
    if ((position <= 0) || (position > listLength + 1))
    {
        cout << "nError: the given position is out of range.n";
        return false;
    }
    if (head -> next == NULL)
    {
       cout << "nError: there is nothing to remove.n";
       return false;
    }
    int count = 0;
    node * p = head;
    node * q = head;
    while (q)
    {
        if (count == position)
        {
            p -> next = q -> next;
            delete q;
            listLength--;
            return true;
        }
        p = q;
        q = p -> next;
        count++;
    }
    cout << "nError: nothing was removed from the list.n";
    return false;
}

// Prints each node in the list in consecutive order,
// starting at the head and ending at the tail.
// Prints the data to the console.
void LinkedList::printList()
{
    node * p = head;
    node * q = head;
    cout << "n---------------------------n";
    cout << "Song Playlist n";
    int count = 0;
    while (q)
    {
        p = q;
        cout << "n-----------------------------n";
        cout << "t position: " << count << endl;
        cout << "t song: " << p -> song << endl;
        cout << "t artist: " << p -> artist << endl;
        q = p -> next;
        count++;
    }
}

// Destructor de-allocates memory used by the list.
LinkedList::~LinkedList()
{
    node * p = head;
    node * q = head;
    while (q)
    {
        p = q;
        q = p -> next;
        if (q) delete p;
    }
}

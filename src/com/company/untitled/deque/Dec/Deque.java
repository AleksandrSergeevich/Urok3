package com.company.untitled.deque.Dec;



class Deque
{
    final int maxSize = 10000;
    int size;
    public int head, end;
    int[] data;

    public Deque()
    {
        data = new int[maxSize];
        head = 0;
        end = 0;
        size = 0;
    }

    public void push_front(int e)
    {
        if (size == maxSize)
        {
            System.out.println("Deque is full.");
            return;
        }
        else if (size==0)
        {
            end = head;
            data[head] = e;
            size++;
        }
        else
        {
            head++;
            if (head>=maxSize)
                head = 0;
            data[head] = e;
            size++;
        }
        System.out.println("ok");
    }

    public void push_back(int e)
    {
        if (size == maxSize)
        {
            System.out.println("Deque is full.");
            return;
        }
        else if (size==0)
        {
            head = end;
            data[end] = e;
            size++;
        }
        else
        {
            end--;
            if (end<0)
                end = maxSize-1;
            data[end] = e;
            size++;
        }
        System.out.println("ok");
    }

    public void clear()
    {
        head = 0;
        end = 0;
        size = 0;
        System.out.println("ok");
    }

    public int size()
    {
        return size;
    }

    public int back()
    {
        if (size!=0)
            return data[end];
        else
            return -1;
    }

    public int front()
    {
        if (size!=0)
            return data[head];
        else
            return -1;
    }

    public int pop_back()
    {
        if (size!=0)
        {
            int tmp = data[end];
            end++;
            if (end>=maxSize)
                end = 0;
            size --;
            return tmp;
        }
        else
            return -1;
    }

    public int pop_front()
    {
        if (size!=0)
        {
            int tmp = data[head];
            head--;
            if (head<0)
                head = maxSize - 1;
            size --;
            return tmp;
        }
        else
            return -1;
    }
}
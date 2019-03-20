package com.company.untitled.deque.Dec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task {
    static public void main (String[] args) throws IOException
    {
        Deque dq = new Deque();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while((str = br.readLine()) != null)
        {
            String[] inp = str.split(" ");
            if (inp[0].equals("push_front"))
            {
                dq.push_front(Integer.parseInt(inp[1]));
            }
            else if (inp[0].equals("push_back"))
            {
                dq.push_back(Integer.parseInt(inp[1]));
            }
            else if (inp[0].equals("pop_back"))
            {
                System.out.println(dq.pop_back());
            }
            else if (inp[0].equals("pop_front"))
            {
                System.out.println(dq.pop_front());
            }
            else if (inp[0].equals("front"))
            {
                System.out.println(dq.front());
            }
            else if (inp[0].equals("back"))
            {
                System.out.println(dq.back());
            }
            else if (inp[0].equals("size"))
            {
                System.out.println(dq.size());
            }
            else if (inp[0].equals("clear"))
            {
                dq.clear();
            }
            else if (inp[0].equals("exit"))
            {
                System.out.println("bye");
                br.close();
                return;
            }
        }
    }
}

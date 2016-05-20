package com.example.mohdosamah.syncmefy;

/**
 * Created by Shikhar on 18/05/16.
 */
public class Channel {
    final int maxConnections=10;
    int currentCount;
    Server server;
    LinkedList<Client> clients();
    long ID;
    public Channel(Server s,long id)
    {
        server=s;
        ID=id;
        currentCount=0;
    }
    public void connectClient(Client c)
    {
        if(currentCount<maxConnections)
        {
            clients.add(c);
            currentCount++;
        }
        else
        {
            /* Add message here to display that channel is full on client phone as popup*/
        }
    }
    public void disconnectClient(Client c)
    {
        if(currentCount!=0)
        {
            currentCount--;
            clients.remove(c);
        }
        else
        {
            /* print underflow on error log*/
        }
    }
    public void broadcaseFile(File f)
    {

    }
    public void broadCaseSignals(Data s)
    {

    }

}

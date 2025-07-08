public class circularqueue {
    static class queue
    {
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;

        queue(int size)
        {
            this.size=size;
            arr=new int[size];
        }

        public static boolean isEmpty()
        {
             return front==-1 && rear==-1;
        }

        public static boolean isFull()
        {
            return (rear+1)%size==front;
        }

        //add
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("full");
                return;
            }
            if(front==-1)
            {
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        //remove
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("empty");
                return -1;
            }
            int res=arr[front];
            if(front==rear)
            {
                front=rear=-1;

            }
            else {
                front=(front+1)%size;
            }
            return res;
        }
        public static int peek() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            return arr[front];
        }


    }
    public static void main(String args[])
    {
        queue q = new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);


        while(!q.isEmpty()) {
            System.out.println(q.remove());
        }

    }
}

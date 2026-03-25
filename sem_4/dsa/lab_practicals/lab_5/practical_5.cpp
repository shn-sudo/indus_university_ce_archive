#include<iostream>
using namespace std;

#define MAX 5

class Queue {
    int arr[MAX];
    int front, rear;
public:
    Queue() { front = -1; rear = -1; }

    bool isFull()  { return rear == MAX - 1; }
    bool isEmpty() { return front == -1 || front > rear; }

    void insert(int val) {
        if(isFull()) {
            cout << "Queue is FULL! Cannot insert.\n";
            return;
        }
        if(front == -1) front = 0;
        arr[++rear] = val;
        cout << val << " inserted into queue.\n";
    }

    void deleteQ() {
        if(isEmpty()) {
            cout << "Queue is EMPTY! Cannot delete.\n";
            return;
        }
        cout << arr[front++] << " deleted from queue.\n";
        if(front > rear) front = rear = -1;
    }

    void display() {
        if(isEmpty()) {
            cout << "Queue is EMPTY.\n";
            return;
        }
        cout << "Queue (Front to Rear): ";
        for(int i = front; i <= rear; i++) {
            cout << arr[i];
            if(i < rear) cout << " <- ";
        }
        cout << "\n";
        cout << "Front = " << arr[front] << " | Rear = " << arr[rear] << "\n";
    }
};

int main() {
    Queue q;
    int choice, val;

    do {
        cout << "\n============================\n";
        cout << "       QUEUE MENU\n";
        cout << "============================\n";
        cout << "1. INSERT\n";
        cout << "2. DELETE\n";
        cout << "3. DISPLAY\n";
        cout << "4. EXIT\n";
        cout << "Enter choice: ";
        cin >> choice;

        switch(choice) {
            case 1:
                cout << "Enter value to insert: ";
                cin >> val;
                q.insert(val);
                break;
            case 2:
                q.deleteQ();
                break;
            case 3:
                q.display();
                break;
            case 4:
                cout << "Exiting...\n";
                break;
            default:
                cout << "Invalid choice!\n";
        }
    } while(choice != 4);

    return 0;
}

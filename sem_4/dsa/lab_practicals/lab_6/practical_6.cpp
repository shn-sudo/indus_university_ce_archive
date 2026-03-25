#include<iostream>
using namespace std;

#define MAX 5

class CQueue {
    int arr[MAX];
    int front, rear, count;
public:
    CQueue() { front = -1; rear = -1; count = 0; }

    bool isFull()  { return count == MAX; }
    bool isEmpty() { return count == 0; }

    void insert(int val) {
        if(isFull()) {
            cout << "Circular Queue is FULL! Cannot insert.\n";
            return;
        }
        if(front == -1) front = 0;
        rear = (rear + 1) % MAX;
        arr[rear] = val;
        count++;
        cout << val << " inserted into circular queue.\n";
    }

    void deleteQ() {
        if(isEmpty()) {
            cout << "Circular Queue is EMPTY! Cannot delete.\n";
            return;
        }
        cout << arr[front] << " deleted from circular queue.\n";
        if(front == rear) {
            // Only one element was present
            front = rear = -1;
        } else {
            front = (front + 1) % MAX;
        }
        count--;
    }

    void display() {
        if(isEmpty()) {
            cout << "Circular Queue is EMPTY.\n";
            return;
        }
        cout << "Circular Queue (Front to Rear): ";
        int i = front;
        int cnt = count;
        while(cnt--) {
            cout << arr[i];
            if(cnt > 0) cout << " -> ";
            i = (i + 1) % MAX;
        }
        cout << "\n";
        cout << "Front = " << arr[front] << " | Rear = " << arr[rear] << "\n";
        cout << "Front Index = " << front << " | Rear Index = " << rear << "\n";
        cout << "Size = " << count << "/" << MAX << "\n";

        // Visual circular representation
        cout << "\n--- Circular View ---\n";
        cout << "  Positions: ";
        for(int j = 0; j < MAX; j++)
            cout << "[ " << j << " ] ";
        cout << "\n";
        cout << "  Values:    ";
        for(int j = 0; j < MAX; j++) {
            // Check if this index holds valid data
            bool valid = false;
            int k = front;
            for(int m = 0; m < count; m++) {
                if(k == j) { valid = true; break; }
                k = (k + 1) % MAX;
            }
            if(valid) cout << "[" << arr[j] << (arr[j]<10?"  ":" ") << "] ";
            else      cout << "[ _ ] ";
        }
        cout << "\n";
        cout << "  Markers:   ";
        for(int j = 0; j < MAX; j++) {
            if(j == front && j == rear) cout << "[F=R] ";
            else if(j == front)         cout << "[ F ] ";
            else if(j == rear)          cout << "[ R ] ";
            else                        cout << "[   ] ";
        }
        cout << "\n";
    }
};

int main() {
    CQueue cq;
    int choice, val;

    do {
        cout << "\n=====================================\n";
        cout << "      CIRCULAR QUEUE MENU\n";
        cout << "=====================================\n";
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
                cq.insert(val);
                break;
            case 2:
                cq.deleteQ();
                break;
            case 3:
                cq.display();
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

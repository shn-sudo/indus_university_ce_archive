#include<iostream>
#include<stack>
#include<string>
using namespace std;

int precedence(char op) {
    if(op == '^') return 3;
    if(op == '*' || op == '/') return 2;
    if(op == '+' || op == '-') return 1;
    return 0;
}

bool isOperand(char c) {
    return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
}

string infixToPostfix(string infix) {
    stack<char> st;
    string postfix = "";

    for(int i = 0; i < infix.length(); i++) {
        char c = infix[i];

        // If operand, add to output
        if(isOperand(c)) {
            postfix += c;
        }
        // If '(', push to stack
        else if(c == '(') {
            st.push(c);
        }
        // If ')', pop until '('
        else if(c == ')') {
            while(!st.empty() && st.top() != '(') {
                postfix += st.top();
                st.pop();
            }
            st.pop(); // remove '('
        }
        // If operator
        else {
            // For right associative '^'
            if(c == '^') {
                while(!st.empty() && precedence(c) < precedence(st.top())) {
                    postfix += st.top();
                    st.pop();
                }
            } else {
                while(!st.empty() && precedence(c) <= precedence(st.top())) {
                    postfix += st.top();
                    st.pop();
                }
            }
            st.push(c);
        }
    }

    // Pop remaining operators
    while(!st.empty()) {
        postfix += st.top();
        st.pop();
    }

    return postfix;
}

int main() {
    string infix;
    cout << "========================================\n";
    cout << "     INFIX TO POSTFIX CONVERSION\n";
    cout << "========================================\n";
    cout << "Enter Infix Expression: ";
    cin >> infix;

    string postfix = infixToPostfix(infix);

    cout << "\nInfix Expression  : " << infix << endl;
    cout << "Postfix Expression: " << postfix << endl;

    // Show step-by-step
    cout << "\n--- Step-by-Step Conversion ---\n";
    cout << left;
    cout << "Step\tSymbol\tStack\t\tPostfix\n";
    cout << "----------------------------------------------\n";

    stack<char> st;
    string result = "";
    int step = 1;

    for(int i = 0; i < infix.length(); i++) {
        char c = infix[i];
        string stackStr = "", postStr = result;

        if(isOperand(c)) {
            result += c;
        } else if(c == '(') {
            st.push(c);
        } else if(c == ')') {
            while(!st.empty() && st.top() != '(') {
                result += st.top();
                st.pop();
            }
            st.pop();
        } else {
            if(c == '^') {
                while(!st.empty() && precedence(c) < precedence(st.top())) {
                    result += st.top(); st.pop();
                }
            } else {
                while(!st.empty() && precedence(c) <= precedence(st.top())) {
                    result += st.top(); st.pop();
                }
            }
            st.push(c);
        }

        // Build stack string for display
        stack<char> temp = st;
        string stkDisplay = "";
        while(!temp.empty()) {
            stkDisplay = temp.top() + stkDisplay;
            temp.pop();
        }
        if(stkDisplay.empty()) stkDisplay = "Empty";

        cout << step++ << "\t" << c << "\t" << stkDisplay << "\t\t" << result << "\n";
    }

    // Drain remaining
    while(!st.empty()) {
        result += st.top();
        st.pop();
        stack<char> temp = st;
        string stkDisplay = "";
        while(!temp.empty()) {
            stkDisplay = temp.top() + stkDisplay;
            temp.pop();
        }
        if(stkDisplay.empty()) stkDisplay = "Empty";
        cout << step++ << "\t-\t" << stkDisplay << "\t\t" << result << "\n";
    }

    cout << "\n========================================\n";
    cout << "Final Postfix: " << result << endl;
    cout << "========================================\n";

    return 0;
}

class BrowserHistory {
    Stack<String> history;
    Stack<String> forwardHistory;

    public BrowserHistory(String homepage) {
        history = new Stack<>();
        forwardHistory = new Stack<>();
        history.push(homepage);
    }

    public void visit(String url) {
        history.push(url);
        forwardHistory.clear();
    }

    public String back(int steps) {
        while (steps > 0 && history.size() > 1) {
            forwardHistory.push(history.pop());
            steps--;
        }
        return history.peek();
    }

    public String forward(int steps) {
        while (steps > 0 && !forwardHistory.isEmpty()) {
            history.push(forwardHistory.pop());
            steps--;
        }
        return history.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
// 901. Online Stock Span

class StockSpanner {

    ArrayList<Integer> stock;    
    public StockSpanner() {
        stock = new ArrayList<Integer>();
    }
    
    public int next(int price) {
        int p = 1;
        for(int i = stock.size()-1 ; i>=0 && stock.get(i)<=price ; i--){
            p++;
        }
        stock.add(price);
        return p;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

package prob5;

public class MyStack implements Stack {
	int top=-1;
	
	
	
	public MyStack(int num){
		
	}
	
	@Override
	public void push(String item) {
		// TODO Auto-generated method stub

	}

	@Override
	public String pop() throws MyStackException {
		if(top==-1){
			throw new MyStackException();
		}
		
		
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}

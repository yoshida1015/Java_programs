//61720435
public class CharSet {
	char[] array;
	void init() {
		array=new char[] {'0','0','0','0'};
	}
	int count() {
		int i,c=0;
		for(i=0;i<4;i++) {
			if(array[i]!='0') {
				c++;
			}
		}
		return c;
	}
	boolean search(char x) {
		int i;
		for(i=0;i<4;i++) {
			if(array[i]==x) {
				return true;
			}
		}
		return false;
	}
	void add(char x){
		int i;
		if(search(x)) {
			return;
		}
		for(i=0;i<4;i++) {
			if(array[i]=='0') {
				array[i]=x;
				return;
				}
			}
		array[0]=x;
		}
	void remove(char x) {
		int i;
		for(i=0;i<4;i++) {
			if(array[i]==x) {
				array[i]='0';
				}
			}
	}
	}

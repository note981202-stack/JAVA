package jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Test { //테이블이랑 매치가 됨
	int bno;
	String title;
	String content;
	String writer; 


@Override
public String toString() {
	return String.format("%3d\t%-20s\t%-20s\t%-10s",bno ,title, content, writer); 
}

}//class end
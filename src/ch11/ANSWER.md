1. 4 
2. 3 
3. 4 
4. 2 
5. 3
6. 출력 결과
	- 10
	- 숫자로 변환할 수 없음
	- 10
	- 인덱스를 초과했음
	- 10
7. 빈칸
	- super(message);
	- super(message);
	- throws NotExistIDException, WrongPasswordException
	- throw new NotExistIDException("아이디가 존재하지 않습니다.");
	- throw new WrongPasswordException("패스워드가 틀립니다.");
 8. 수정 코드
 	try(FileWriter fw = new FileWriter("file.txt")) {
 		fw.write("Java");
 	} catch (IOException e) {
 		e.printStackTrace();
 	}
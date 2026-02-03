package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Properties;

public class FileRead {
	
	/**
	 * NIO
	 * Java version >= 1.8
	 */
	public static void readAndPrintFileDescriptionUseNIO(String parentPath, String file) {
		// 1. 읽으려는 파일을 특정
		File target = new File(parentPath, file);
		
		// 2. 파일의 내용을 읽는다.
		// 3. 파일의 내용을 List에 할당한다.
		try {
			// lines는 메모리를 덜먹음
			Files.lines(target.toPath());
			// 메모리를 많이씀 근데 크게 의미없긴함
			List<String> lines = Files.readAllLines(target.toPath()); 
			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}
	
	/**
	 * IO
	 * Java version < 1.8
	 */
	public static void readAndPrintFileDescriptionUseIO(String parentPath, String file) {
		// 1. 파일 포인터 받음
		File fp = new File(parentPath, file);
		// 2. 파일 존재 여부
		// 3. File or Directory
		if (fp.exists() && fp.isFile()) {
			// 4. Read File			
			// 4-1. 파일의 바이트를 Chunking해서 가져옴
			FileReader fileReader = null;
			BufferedReader bufferedReader = null;
			// 4-2. 파일의 내용을 String으로 변환
			try  {
				fileReader = new FileReader(fp);
				bufferedReader = new BufferedReader(fileReader);
				// need FileNotFoundException Handling.
				// FileNotFoundException extends IOExeption
				// bufferedReader 도 IOExeption을 다뤄야 하므로 한번에 처리
				// 4-3. 출력
				String line = "";
				while ((line = bufferedReader.readLine()) != null) {
					// need IOExeption Handling 
					System.out.println(line);					
				}
			} catch (IOException e) { 
				e.printStackTrace();
			} finally {
				if (bufferedReader != null) {
					try {
						bufferedReader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				if (fileReader != null) {
					try {
						fileReader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}		
	}			
					
	public static void readAndPrintFileDescriptionUseIOAutoClose(String parentPath, String file) {
		// 1. 읽으려는 파일을 특정.
		File target = new File(parentPath, file);
		
		// 2. 파일이 존재하는지 확인.
		// 3. 읽으려는 대상이 진짜 파일이 맞는지 확인.
		if (target.exists() && target.isFile()) {
			// 4. 파일의 내용을 읽기 시작.
//			FileReader fileReader = null;
//			BufferedReader bufferedReader = null;
			
			try (FileReader fileReader = new FileReader(target) ) {
				try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
					String line = null;
					while (true) {
						line = bufferedReader.readLine();
						// EOF 까지 갔느냐.
						if (line == null) {
							break;
						}
						else {
							// 4-3. 내용을 출력한다. 
							System.out.println(line);
						}
					}
				}
			}
			catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// OS 가 다를경우
		Properties props = System.getProperties();
		//System.out.println(props);
		String homePath = props.get("user.home").toString();
		System.out.println(props.get("user.home"));
		
		// HOME 에 대한 시스템 환경 변수 설정이 안되어있어서 불가하고 prop으로 가져오자.
//		Map<String, String> env = System.getenv();
//		System.out.println(env);
//		System.out.println(env.get("HOME"));
		
		// C:\JavaExam 폴더의 정보를 추출
		File dir = new File("C:\\JavaExam");
		// File.separator 는 OS 디렉토리 구분자 Windows = '\' / macOS = '/'
		File dir2 = new File(homePath + File.separator + "JavaExam"); // OS가 다를경우
		System.out.println(dir2);
		
		// 1. 폴더의 이름 출력.
		String dirName = dir.getName();
		System.out.println("폴더 이름: " + dirName);
		
		// 2. 이 경로가 가리키는 것이 파일인지 폴더인지를 구분
		boolean isFile = dir.isFile();
		System.out.println("파일 여부: " + isFile);
		boolean isDir = dir.isDirectory();
		System.out.println("디렉토리 여부: " + isDir);
		
		// 3. 이 경로가 실제 존재하는 것인지.
		boolean isExist = dir.exists();
		System.out.println("존재 여부: " + isExist);
		
		// 4. 이 경로의 크기(폴더의 크기) 출력.
		long dirSize = dir.length(); // 페이지 단위로 나오는데 부족하면 내리는듯함
		System.out.println("디렉토리 크기: " + dirSize);
		
		// -------------------------------------------------------------- 
		// 파일
		
		File file = new File(homePath + File.separator + "JavaExam", "JavaExam.txt");
		// 1. 파일의 이름 출력.
		String fileName = file.getName();
		// 2. 파일이 폴더인지 파일인지 구분해서 출력
		// 3. 이 파일이 실제 존재하는 것인지 출력
		// 4. 파일의 크기를 출력
		// 5. 이 파일이 있는 부모의 경로를 출력 --> FILE I/O할때 아주 많이 쓰임
		System.out.println(file.getParent());
		System.out.println(file.getParentFile()); // 상위가 어차피 Dir이라서
		// 6. 이 파일의 경로를 출력
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		
		// -------------------------------------------------------------- 		
		readAndPrintFileDescriptionUseNIO(homePath + File.separator + "JavaExam", "JavaExam.txt");
	}
}

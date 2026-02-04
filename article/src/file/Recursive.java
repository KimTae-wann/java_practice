package file;

import java.io.File;

public class Recursive {
	
	public void printFiles(File target) {
		
		if (target.isFile()) {
			System.out.println(target.getAbsolutePath());
		} else if (target.isDirectory()) {
			File[] childDir = target.listFiles();
			for (File file : childDir) {
				this.printFiles(file);
			}
		}
 	}
	
	public void deleteDirectory(File target) {
		if (target.isFile()) {
			System.out.println(target.getAbsolutePath());
			target.delete();
		} else if (target.isDirectory()) {
			File[] children = target.listFiles();
			
			for (File child : children) {
				this.deleteDirectory(child);
			}
			target.delete();
		}
	}
	
	public static void main(String[] args) {
		Recursive r = new Recursive();
		
		File root = new File("C://FinalExam");
		r.printFiles(root);

		File deleteRoot = new File("C://FinalExam/삭제대상");
		r.deleteDirectory(deleteRoot);
	}
}

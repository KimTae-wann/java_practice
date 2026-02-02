package generics;

public interface Reducer<INPUT, OUTPUT> {
	OUTPUT reduce(INPUT input, OUTPUT output);
}

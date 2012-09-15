import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class decoder 
{
	private static FileInputStream decoder;

	public static void main(String[] a) throws IOException
	{
		File secretMessage = new File("/Users/droid3/Documents/workspace/Python Challenge/src/secret message");
		System.out.println(secretMessage.length());
		decoder = new FileInputStream(secretMessage);
		byte[] b = new byte[(int) secretMessage.length()];
		decoder.read(b);
		int i = 0;
		while (i < b.length)
		{
			if (b[i] == 'y')
			{
				b[i] = 'a';
			}else if (b[i] == 'z')
			{
				b[i] = 'b';
			}else if (b[i] != ' ' && b[i] != ',' && b[i] != '.' && b[i] != '\'' && b[i] != '(' && b[i] != ')')
			{
				b[i] += 2;
			}
			i ++;
		}
		String decodedMessage = new String(b);
		System.out.println(decodedMessage);
		
	}
}

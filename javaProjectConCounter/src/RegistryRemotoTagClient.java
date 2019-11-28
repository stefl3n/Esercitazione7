import java.rmi.RemoteException;

public interface RegistryRemotoTagClient extends RegistryRemotoClient{
	public String[] cercaTag(String nomeLogico) throws RemoteException;
}

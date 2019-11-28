import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.registry.RegistryHandler;

public interface RegistryRemotoTagServer extends RegistryRemotoTagClient, RegistryRemotoServer{
	public int associaTag(String nomeLogico, String tag) throws RemoteException;
}

import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.Cipher;


public class RSAHelper {
	
	private static RSAHelper instance;
	
	public static RSAHelper getInstance(){
		if (instance == null) {
			instance = new RSAHelper();
		}
		
		return instance;
	}
	
	private PublicKey publicKey;
	
	private PrivateKey privateKey;
	
	
	
	private RSAHelper() {
		
	}
	
	public RSAHelper init(PublicKey publicKey, PrivateKey privateKey){
		return setPublicKey(publicKey).setPrivateKey(privateKey);
	}
	
	
	public RSAHelper init(String publicKeyStr, String privateKeyStr) throws Exception{
		return setPublicKey(RSAUtils.loadPublicKey(publicKeyStr)).setPrivateKey(RSAUtils.loadPrivateKey(privateKeyStr));
	}
	

	public RSAHelper setPublicKey(PublicKey publicKey) {
		this.publicKey = publicKey;
		return this;
	}

	public RSAHelper setPrivateKey(PrivateKey privateKey) {
		this.privateKey = privateKey;
		return this;
	}

	/**
	 * 用公钥加密 <br>
	 * 每次加密的字节数，不能超过密钥的长度值减去11
	 * 
	 * @param data
	 *            需加密数据的byte数据
	 * @param pubKey
	 *            公钥
	 * @return 加密后的byte型数据
	 */
	public byte[] encryptData(byte[] data) {
		return RSAUtils.encryptData(data, publicKey);
	}

	/**
	 * 用私钥解密
	 * 
	 * @param encryptedData
	 *            经过encryptedData()加密返回的byte数据
	 * @param privateKey
	 *            私钥
	 * @return
	 */
	public byte[] decryptData(byte[] encryptedData) {
		return RSAUtils.decryptData(encryptedData, privateKey);
	}
	
	
	/**
	 * 二行制转字符串
	 * 
	 * @param b
	 * @return
	 */
	public static String byte2hex(byte[] b) {
		return RSAUtils.byte2hex(b);
	}

	public static byte[] hex2byte(String hexString) {
		return RSAUtils.hex2byte(hexString);
	}
}

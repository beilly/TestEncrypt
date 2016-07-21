import java.security.PrivateKey;
import java.security.PublicKey;

import org.apaches.commons.codec.binary.Base64;

/**     rsa_public_key

 MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCvy/nXti2Jn/EjIKo/UFmSqPus
 kIpUlP8+a/VXjmim8hn6ckNf+hYEa+PHNgA8bckO8a66yOoS9Q3e9YoX8gxnjOKi
 wfoopnf+nHgwVKG2pDo+OWUx4z/xskt4TygwDjl7suncRU79/SQJHVf9t2LTqss3
 Bwn86r2ZLHxPlNN4vwIDAQAB

 */

/**    rsa_private_key


 MIICXAIBAAKBgQCvy/nXti2Jn/EjIKo/UFmSqPuskIpUlP8+a/VXjmim8hn6ckNf
 +hYEa+PHNgA8bckO8a66yOoS9Q3e9YoX8gxnjOKiwfoopnf+nHgwVKG2pDo+OWUx
 4z/xskt4TygwDjl7suncRU79/SQJHVf9t2LTqss3Bwn86r2ZLHxPlNN4vwIDAQAB
 AoGBAICE9tqk7RW4QGoV72DqNRHrSFMYOIkthIz2EB86lXe3dxaJgoggJQiGd7ej
 2vhSqrKqLbuQNtA1Jzbg+1wWMMosp8pSLd8ufBxDr+19FgT8uIFR/5RC9MO5cE2m
 QKWmqXFE/Jq8tj+aoFccZdQNsWZpk1XVS/ImEz4r7WRiIAyBAkEA4Aw6P5wRgOeu
 N9PLDZWJBPmQrUnqUZj4LxvuwxuPS2iy1a8PT9JfwnjN3J3+Q5WiaoeTVn4c/YC1
 dlOJJLQ9dwJBAMjeJosLM1XOJsKzm0fMWUr5DDbTTmUFXNyLReOvjRobE2t/G9EF
 H2ZluAAR1iRPM2pF82fezZQK+70bkLXF0PkCQDYW/aEJvrgONuNHgIghB9lpnuIX
 LDjS42gMKFJ2PtwHxNUN1HaC5Zd/rsOKaS5L29A4Nvv0qm8ROb39YOi5kvUCQEQj
 2D9i1U9OV6fE9fAtSj08rwAKPpXWc+H8/QB4FQ2+EaBtxinp6vT5nKmpY1N96psq
 j5+03VhTQYKtTzHaoUECQGEWLJ7aq2vT/CVZGkf3H/pZF+behDlpqNrbsU14e9Fe
 CEKdN6VLV+3NhsHwGkkKqVFWPazggWawBRfRW9qxTus=


 */

/**
 * pkcs8_rsa_private_key
 * 
 * 
 * MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAK/L+de2LYmf8SMg
 * qj9QWZKo+6yQilSU/z5r9VeOaKbyGfpyQ1/6FgRr48c2ADxtyQ7xrrrI6hL1Dd71
 * ihfyDGeM4qLB+iimd/6ceDBUobakOj45ZTHjP/GyS3hPKDAOOXuy6dxFTv39JAkd
 * V/23YtOqyzcHCfzqvZksfE+U03i/AgMBAAECgYEAgIT22qTtFbhAahXvYOo1EetI
 * Uxg4iS2EjPYQHzqVd7d3FomCiCAlCIZ3t6Pa+FKqsqotu5A20DUnNuD7XBYwyiyn
 * ylIt3y58HEOv7X0WBPy4gVH/lEL0w7lwTaZApaapcUT8mry2P5qgVxxl1A2xZmmT
 * VdVL8iYTPivtZGIgDIECQQDgDDo/nBGA564308sNlYkE+ZCtSepRmPgvG+7DG49L
 * aLLVrw9P0l/CeM3cnf5DlaJqh5NWfhz9gLV2U4kktD13AkEAyN4miwszVc4mwrOb
 * R8xZSvkMNtNOZQVc3ItF46+NGhsTa38b0QUfZmW4ABHWJE8zakXzZ97NlAr7vRuQ
 * tcXQ+QJANhb9oQm+uA4240eAiCEH2Wme4hcsONLjaAwoUnY+3AfE1Q3UdoLll3+u
 * w4ppLkvb0Dg2+/SqbxE5vf1g6LmS9QJARCPYP2LVT05Xp8T18C1KPTyvAAo+ldZz
 * 4fz9AHgVDb4RoG3GKenq9PmcqaljU33qmyqPn7TdWFNBgq1PMdqhQQJAYRYsntqr
 * a9P8JVkaR/cf+lkX5t6EOWmo2tuxTXh70V4IQp03pUtX7c2GwfAaSQqpUVY9rOCB
 * ZrAFF9Fb2rFO6w==
 */

public class TestIOS {
	static String str = "yanzi1225627";

	static String enRsaStr = "FYrPvGAdh43EtG+4NrqHfRYD22ujiCYYrUgr3+RwUzDi3mOUFyQFfstKxMpf4H8Jv4s9diXCrAQFlVgl69VLv6Ea7defx234dsRV7qIbVg7c3OowiAs2oN3lJrXn6RilME0fSPA4bqB2aX4pGk9ERbOQfDT5f38QQz4ePSe9LOQ=";

	private static String publicKeyStr = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCvy/nXti2Jn/EjIKo/UFmSqPus" +
			"kIpUlP8+a/VXjmim8hn6ckNf+hYEa+PHNgA8bckO8a66yOoS9Q3e9YoX8gxnjOKiwf" +
			"oopnf+nHgwVKG2pDo+OWUx4z/xskt4TygwDjl7suncRU79/SQJHVf9t2LTqss3Bwn86" +
			"r2ZLHxPlNN4vwIDAQAB";

	// 转换过的私钥
	private static String privateKeyStr = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAK/L+de2LYmf8SMg"
			+ "qj9QWZKo+6yQilSU/z5r9VeOaKbyGfpyQ1/6FgRr48c2ADxtyQ7xrrrI6hL1Dd71"
			+ "ihfyDGeM4qLB+iimd/6ceDBUobakOj45ZTHjP/GyS3hPKDAOOXuy6dxFTv39JAkd"
			+ "V/23YtOqyzcHCfzqvZksfE+U03i/AgMBAAECgYEAgIT22qTtFbhAahXvYOo1EetI"
			+ "Uxg4iS2EjPYQHzqVd7d3FomCiCAlCIZ3t6Pa+FKqsqotu5A20DUnNuD7XBYwyiyn"
			+ "ylIt3y58HEOv7X0WBPy4gVH/lEL0w7lwTaZApaapcUT8mry2P5qgVxxl1A2xZmmT"
			+ "VdVL8iYTPivtZGIgDIECQQDgDDo/nBGA564308sNlYkE+ZCtSepRmPgvG+7DG49L"
			+ "aLLVrw9P0l/CeM3cnf5DlaJqh5NWfhz9gLV2U4kktD13AkEAyN4miwszVc4mwrOb"
			+ "R8xZSvkMNtNOZQVc3ItF46+NGhsTa38b0QUfZmW4ABHWJE8zakXzZ97NlAr7vRuQ"
			+ "tcXQ+QJANhb9oQm+uA4240eAiCEH2Wme4hcsONLjaAwoUnY+3AfE1Q3UdoLll3+u"
			+ "w4ppLkvb0Dg2+/SqbxE5vf1g6LmS9QJARCPYP2LVT05Xp8T18C1KPTyvAAo+ldZz"
			+ "4fz9AHgVDb4RoG3GKenq9PmcqaljU33qmyqPn7TdWFNBgq1PMdqhQQJAYRYsntqr"
			+ "a9P8JVkaR/cf+lkX5t6EOWmo2tuxTXh70V4IQp03pUtX7c2GwfAaSQqpUVY9rOCB"
			+ "ZrAFF9Fb2rFO6w==";

	// 原始私钥
	private static String privateKeyStr11 = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAK/L+de2LYmf8S" +
			"Mgqj9QWZKo+6yQilSU/z5r9VeOaKbyGfpyQ1/6FgRr48c2ADxtyQ7xrrrI6hL1Dd71ihfyDGeM4qLB+iimd/6ceDBUobak" +
			"Oj45ZTHjP/GyS3hPKDAOOXuy6dxFTv39JAkdV/23YtOqyzcHCfzqvZksfE+U03i/AgMBAAECgYEAgIT22qTtFbhAahXvYO" +
			"o1EetIUxg4iS2EjPYQHzqVd7d3FomCiCAlCIZ3t6Pa+FKqsqotu5A20DUnNuD7XBYwyiynylIt3y58HEOv7X0WBPy4gVH/" +
			"lEL0w7lwTaZApaapcUT8mry2P5qgVxxl1A2xZmmTVdVL8iYTPivtZGIgDIECQQDgDDo/nBGA564308sNlYkE+ZCtSepRmP" +
			"gvG+7DG49LaLLVrw9P0l/CeM3cnf5DlaJqh5NWfhz9gLV2U4kktD13AkEAyN4miwszVc4mwrObR8xZSvkMNtNOZQVc3ItF" +
			"46+NGhsTa38b0QUfZmW4ABHWJE8zakXzZ97NlAr7vRuQtcXQ+QJANhb9oQm+uA4240eAiCEH2Wme4hcsONLjaAwoUnY+3A" +
			"fE1Q3UdoLll3+uw4ppLkvb0Dg2+/SqbxE5vf1g6LmS9QJARCPYP2LVT05Xp8T18C1KPTyvAAo+ldZz4fz9AHgVDb4RoG3G" +
			"Kenq9PmcqaljU33qmyqPn7TdWFNBgq1PMdqhQQJAYRYsntqra9P8JVkaR/cf+lkX5t6EOWmo2tuxTXh70V4IQp03pUtX7c" +
			"2GwfAaSQqpUVY9rOCBZrAFF9Fb2rFO6w==";

	private static PublicKey publicKey;
	private static PrivateKey privateKey;

	public static void main(String[] args) {
		try {
			byte[] enRsaBytes = str.getBytes("utf-8");

			// 生成随机秘钥
			// KeyPair keyPair = RSAUtils.generateRSAKeyPair();
			// publicKey = keyPair.getPublic();
			// privateKey = keyPair.getPrivate();
			//
			// publicKeyStr = RSAUtils.byte2hex(publicKey.getEncoded());
			// privateKeyStr = RSAUtils.byte2hex(privateKey.getEncoded());

			// byte[] encryptData = RSAUtils.encryptData(enRsaBytes, publicKey);
			// enRsaStr = RSAUtils.byte2hex(encryptData);

			// 使用上面指定的数据初始化
			RSAHelper rsaHelper = RSAHelper.getInstance();
			
			byte[] publicKeyBytes = Base64.decodeBase64(publicKeyStr);
			byte[] privateKeyBytes = Base64.decodeBase64(privateKeyStr);
			byte[] privateKeyBytes11 = Base64.decodeBase64(privateKeyStr11);
			enRsaStr = RSAHelper.byte2hex(Base64.decodeBase64(enRsaStr));
			
			rsaHelper.init(publicKeyBytes, privateKeyBytes11);

			System.out.println(System.currentTimeMillis() + "公钥=="
					+ publicKeyStr);
			System.out.println(System.currentTimeMillis() + "私钥=="
					+ privateKeyStr);
			System.out.println(System.currentTimeMillis() + "私钥=="
					+ privateKeyStr11);

			System.out.println(System.currentTimeMillis() + "加密后==" + enRsaStr);

			String decryptData = new String(rsaHelper.decryptData(RSAHelper
					.hex2byte(enRsaStr)), "utf-8");

			System.out.println(System.currentTimeMillis() + "解密后=="
					+ decryptData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

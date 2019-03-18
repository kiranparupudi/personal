/**
 * 
 */
package com.kiran.general.hackerrank.warmup;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kiran
 *
 */
public class SockMerchant {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		int result = 0;
		Map<Integer, Integer> socks = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++) {
			if(!socks.containsKey(ar[i]))
				socks.put(ar[i], 1);
			else {
				socks.put(ar[i], (socks.get(ar[i]) + 1));
				if(socks.get(ar[i]) % 2 == 0)
					result += 1;
			}
		}
		/*for(int sock : socks.keySet()) {
			result += socks.get(sock) / 2;
		}*/
		return result;
	}

	public static void main(String[] args) {
		int n = 10;
		String[] arItems = "1 1 3 1 2 1 3 3 3 3".split(" ");
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);
		System.out.println("Total number of matching pairs of socks: " + result);
	}

}
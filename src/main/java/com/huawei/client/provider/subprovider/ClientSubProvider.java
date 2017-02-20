package com.huawei.client.provider.subprovider;

import com.huawei._1_fw.component.latch.ILatchCallback;
import com.huawei._1_fw.component.latch.LatchUtils;

public class ClientSubProvider {
	public static void hello() {
		LatchUtils oLatchUtils = new LatchUtils();
		oLatchUtils.run(new ILatchCallback() {
			@Override
			public void run() {
				try {
					Thread.sleep(4000);
					System.out.println("heiheihei....");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}, 3000);
	}
}

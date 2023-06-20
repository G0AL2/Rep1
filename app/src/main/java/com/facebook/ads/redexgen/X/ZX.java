package com.facebook.ads.redexgen.X;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class ZX implements InterfaceC07386v {
    public static String[] A02 = {"2ZaMFzGKyd9hSHjcUno1udsEhbeu09ce", "vtEgA47YqlpfzAewuy7ISaRlDIFsO2a2", "0pnteHQI04JELPJiiEYAY3M", "2nICVeqwE", "Lm6L6ti1RgkYKkQwD0idrMIu4GdN9z0L", "56JOKRJet", "nEp6Q7dVZjXWwne9d2QyLy7miVXBQb0l", "dXPHGnc4ncUJghGdDaugHzl"};
    public final /* synthetic */ ZV A00;
    public final /* synthetic */ List A01;

    public ZX(ZV zv, List list) {
        this.A00 = zv;
        this.A01 = list;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        C7A A022;
        String A07;
        File A03;
        HashMap hashMap = new HashMap();
        Iterator it = this.A01.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A02;
            if (strArr[2].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "3z5KEoLDxtAdyJAxPBbZMV2";
            strArr2[5] = "xCESy1UOQ";
            if (!hasNext) {
                A022 = this.A00.A02(hashMap);
                return A022;
            }
            C07376u c07376u = (C07376u) it.next();
            if (c07376u.A02()) {
                A07 = ZV.A07((String) c07376u.A01());
                A03 = ZV.A03(A07);
                hashMap.put(A07, new ZW(A03));
            }
        }
    }
}

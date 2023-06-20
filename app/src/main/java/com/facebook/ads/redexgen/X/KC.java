package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class KC implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ C8U A00;
    public final /* synthetic */ KF A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 121);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{3, 27, 5, 60, 61, 39, 32, 59, 38, 45, 89, 78, 91, 68, 89, 95, 66, 69, 76, 54, 33, 53, 49, 33, 55, 48, 27, 45, 32};
    }

    public KC(KF kf2, String str, C8U c8u) {
        this.A01 = kf2;
        this.A02 = str;
        this.A00 = c8u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        ArrayList arrayList;
        List list3;
        int i10;
        int i11;
        int i12;
        if (L0.A02(this)) {
            return;
        }
        try {
            AnonymousClass90 anonymousClass90 = new AnonymousClass90(A00(0, 3, 52));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, 45), jSONArray);
            jSONObject.put(A00(19, 10, 61), this.A02);
            list = this.A01.A0D;
            synchronized (list) {
                list2 = this.A01.A0D;
                arrayList = new ArrayList(list2);
                list3 = this.A01.A0D;
                list3.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                KE ke2 = (KE) it.next();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(A00(0, 0, 60));
                i10 = ke2.A00;
                sb2.append(i10);
                sb2.append(';');
                i11 = ke2.A02;
                sb2.append(i11);
                sb2.append(';');
                i12 = ke2.A01;
                sb2.append(i12);
                jSONArray.put(sb2.toString());
            }
            anonymousClass90.A05(jSONObject);
            anonymousClass90.A03(1);
            this.A00.A06().A8z(A00(10, 9, 82), C07828z.A2Q, anonymousClass90);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}

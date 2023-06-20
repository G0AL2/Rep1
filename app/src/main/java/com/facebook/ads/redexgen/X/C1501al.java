package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.al  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1501al implements InterfaceC07386v {
    public final /* synthetic */ C1488aY A00;

    public C1501al(C1488aY c1488aY) {
        this.A00 = c1488aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() throws CertificateException, PackageManager.NameNotFoundException, NoSuchAlgorithmException {
        Context context;
        Context context2;
        C7A A05;
        context = this.A00.A00;
        PackageManager packageManager = context.getPackageManager();
        context2 = this.A00.A00;
        Signature[] signatureArr = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < signatureArr.length; i10++) {
            hashMap.put(Integer.valueOf(i10), new C1489aZ(signatureArr[i10]));
        }
        A05 = this.A00.A05(hashMap);
        return A05;
    }
}

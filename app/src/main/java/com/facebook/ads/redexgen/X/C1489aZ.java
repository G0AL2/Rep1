package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.pm.Signature;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.aZ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1489aZ implements AnonymousClass72<Integer> {
    public static byte[] A02;
    public final String A00;
    public final String A01;

    static {
        A03();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 37);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-38, -80, -73, -78, -69, -77, 113, 12, -53};
    }

    public C1489aZ(Signature signature) throws CertificateException, NoSuchAlgorithmException {
        this.A00 = A01(signature, C7I.A05);
        this.A01 = A01(signature, C7I.A06);
    }

    public static String A01(Signature signature, C7I c7i) throws NoSuchAlgorithmException, CertificateException {
        InputStream input = new ByteArrayInputStream(signature.toByteArray());
        X509Certificate cert = (X509Certificate) CertificateFactory.getInstance(A00(0, 5, 93)).generateCertificate(input);
        return C7J.A08(cert.getEncoded(), c7i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    /* renamed from: A02 */
    public final JSONObject AFB(Integer num, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A00(5, 2, 27), this.A00);
        jSONObject2.put(A00(7, 2, 116), this.A01);
        jSONObject.put(Integer.toString(num.intValue()), jSONObject2);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    public final boolean A8S(Object obj) {
        String str;
        C1489aZ c1489aZ = (C1489aZ) obj;
        String str2 = this.A00;
        return str2 != null && str2.equals(c1489aZ.A00) && (str = this.A01) != null && str.equals(c1489aZ.A01);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public final int AEp() {
        String str = this.A01;
        int length = str != null ? str.length() : 0;
        String str2 = this.A00;
        return length + (str2 != null ? str2.length() : 0);
    }
}

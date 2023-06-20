package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bK  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1536bK implements InterfaceC07025k {
    public static byte[] A03;
    public static String[] A04 = {"Yyt8Jrp", "FvQHlihhdkZe9tXm7YLHdG4gIBqm", "h7ITXytSbKbsxwMfZDKdUPEvMsTrizAq", "0TuNzKSIMRKA8K3EzRQL94hbriXTa7QT", "ySuQOOQJHVodSpCznPaDLfXVVxuxvbGA", "XYB8XYCfCTfWBGtKG07Wi1HuHmIQx2qC", "71D0xe3tljOi7f3b0iOVOXaXnoSWhNo4", "dwdYeokke3ChTNA3vTF4hdqHGwVronGN"};
    public final RR A01;
    public Set<InterfaceC07055n> A00 = new HashSet();
    public final List<InterfaceC07045m> A02 = new ArrayList();

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-72, -72, -67, 11, -46, -72, -67, 11, 41, 59, 59, 45, 60, 59};
    }

    static {
        A02();
    }

    public C1536bK(GU gu) {
        this.A01 = gu.A4O(RS.A0B);
        this.A01.A3F(new C1537bL(this));
        A03();
    }

    @Nullable
    public static Set<InterfaceC07055n> A01(JSONObject jSONObject) {
        C1535bJ A00;
        HashSet hashSet = new HashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(8, 6, 93));
        if (optJSONArray == null) {
            return null;
        }
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            JSONObject assetJson = optJSONArray.optJSONObject(i10);
            if (assetJson == null || (A00 = C1535bJ.A00(assetJson)) == null) {
                return null;
            }
            hashSet.add(A00);
            int i11 = A04[1].length();
            if (i11 == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "2zeGpFgTpOohtr7xv9EhLTO87hKhrQIZ";
            strArr[3] = "Z45Lb0RXWpRaUi2IX7mXCACeVe5qt7dU";
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A03() {
        if (!this.A01.A8c()) {
            BuildConfigApi.isDebug();
            return;
        }
        Set<InterfaceC07055n> A01 = A01(this.A01.A6J());
        if (!this.A00.equals(A01) && A01 != null) {
            this.A00 = A01;
            for (InterfaceC07045m listener : this.A02) {
                listener.A3S();
            }
        }
        if (BuildConfigApi.isDebug()) {
            for (InterfaceC07055n interfaceC07055n : this.A00) {
                String.format(Locale.US, A00(0, 8, 45), interfaceC07055n.A7j(), interfaceC07055n.getUrl());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07025k
    public final void A3D(InterfaceC07045m interfaceC07045m) {
        this.A02.add(interfaceC07045m);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07025k
    public final synchronized Set<InterfaceC07055n> A5j() {
        return new HashSet(this.A00);
    }
}

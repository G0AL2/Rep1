package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.m;
import com.fyber.inneractive.sdk.model.vast.n;
import java.util.Comparator;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d implements Comparator<m> {

    /* renamed from: a  reason: collision with root package name */
    public int f17321a;

    /* renamed from: b  reason: collision with root package name */
    public int f17322b;

    /* renamed from: c  reason: collision with root package name */
    public int f17323c;

    public d(int i10, int i11, int i12) {
        this.f17321a = i10;
        this.f17322b = i11;
        this.f17323c = i12;
    }

    public final Integer a(String str) {
        HashMap hashMap = (HashMap) n.f17448f;
        n nVar = hashMap.containsKey(str) ? (n) hashMap.get(str) : n.UNKNOWN;
        if (nVar == n.MEDIA_TYPE_MP4) {
            return 3;
        }
        if (nVar == n.MEDIA_TYPE_3GPP) {
            return 2;
        }
        if (nVar == n.MEDIA_TYPE_WEBM) {
            return 1;
        }
        return -1;
    }

    @Override // java.util.Comparator
    public int compare(m mVar, m mVar2) {
        m mVar3 = mVar;
        m mVar4 = mVar2;
        if (!TextUtils.equals("VPAID", mVar4.f17442f)) {
            if (!TextUtils.equals("VPAID", mVar3.f17442f)) {
                Integer num = mVar3.f17441e;
                int intValue = num == null ? 0 : num.intValue();
                Integer num2 = mVar4.f17441e;
                int intValue2 = num2 == null ? 0 : num2.intValue();
                int i10 = this.f17321a;
                if (intValue2 <= i10 || intValue > i10) {
                    if (intValue <= i10 || intValue2 > i10) {
                        int compareTo = a(mVar4.f17440d).compareTo(a(mVar3.f17440d));
                        if (compareTo != 0) {
                            return compareTo;
                        }
                        if (intValue >= intValue2) {
                            if (intValue <= intValue2) {
                                Integer num3 = mVar3.f17438b;
                                int intValue3 = num3 == null ? 0 : num3.intValue();
                                Integer num4 = mVar3.f17439c;
                                int intValue4 = num4 == null ? 0 : num4.intValue();
                                Integer num5 = mVar4.f17438b;
                                int intValue5 = num5 == null ? 0 : num5.intValue();
                                Integer num6 = mVar4.f17439c;
                                int i11 = intValue3 * intValue4;
                                int intValue6 = intValue5 * (num6 == null ? 0 : num6.intValue());
                                int i12 = this.f17322b * this.f17323c;
                                int abs = Math.abs(i11 - i12);
                                int abs2 = Math.abs(intValue6 - i12);
                                if (abs >= abs2) {
                                    if (abs <= abs2) {
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}

package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import com.inmobi.unifiedId.InMobiUserDataTypes;
import java.util.HashMap;

/* compiled from: HashedPII.java */
/* loaded from: classes3.dex */
public final class jj {

    /* renamed from: a  reason: collision with root package name */
    private static InMobiUserDataModel f25867a;

    public static synchronized void a(InMobiUserDataModel inMobiUserDataModel) {
        synchronized (jj.class) {
            f25867a = inMobiUserDataModel;
        }
    }

    public static InMobiUserDataTypes b() {
        InMobiUserDataModel inMobiUserDataModel = f25867a;
        if (inMobiUserDataModel == null) {
            return null;
        }
        return a(inMobiUserDataModel.getEmailId());
    }

    public static HashMap<String, String> c() {
        InMobiUserDataModel inMobiUserDataModel = f25867a;
        if (inMobiUserDataModel == null) {
            return null;
        }
        return inMobiUserDataModel.getExtras();
    }

    public static boolean b(InMobiUserDataModel inMobiUserDataModel) {
        InMobiUserDataModel inMobiUserDataModel2;
        if (inMobiUserDataModel == null && f25867a == null) {
            return true;
        }
        if (inMobiUserDataModel == null || (inMobiUserDataModel2 = f25867a) == null) {
            return false;
        }
        return inMobiUserDataModel.equals(inMobiUserDataModel2);
    }

    public static InMobiUserDataTypes a() {
        InMobiUserDataModel inMobiUserDataModel = f25867a;
        if (inMobiUserDataModel == null) {
            return null;
        }
        return a(inMobiUserDataModel.getPhoneNumber());
    }

    private static InMobiUserDataTypes a(InMobiUserDataTypes inMobiUserDataTypes) {
        if (inMobiUserDataTypes == null) {
            return null;
        }
        if (inMobiUserDataTypes.getMd5() == null && inMobiUserDataTypes.getSha1() == null && inMobiUserDataTypes.getSha256() == null) {
            return null;
        }
        return inMobiUserDataTypes;
    }
}

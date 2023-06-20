package com.ironsource.mediationsdk.utils;

import android.text.TextUtils;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Random;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: d  reason: collision with root package name */
    private static final g f27436d = new g();

    /* renamed from: a  reason: collision with root package name */
    private String f27437a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f27438b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f27439c = "";

    public static g a() {
        return f27436d;
    }

    public final String b() {
        if (TextUtils.isEmpty(this.f27437a)) {
            this.f27437a = "C38FB23A402222A0C17D34A92F971D1F";
        }
        return this.f27437a;
    }

    public final synchronized String c() {
        if (TextUtils.isEmpty(this.f27438b)) {
            StringBuilder sb2 = new StringBuilder();
            Random random = new Random();
            for (int i10 = 0; i10 < 32; i10++) {
                sb2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".charAt(random.nextInt(93)));
            }
            this.f27438b = sb2.toString();
        }
        return this.f27438b;
    }

    public final String d() {
        if (TextUtils.isEmpty(this.f27439c)) {
            try {
                this.f27439c = a.AnonymousClass1.a(c(), "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB");
            } catch (Exception e10) {
                String str = "Session key encryption exception: " + e10.getLocalizedMessage();
                IronLog.INTERNAL.error(str);
                throw new JSONException(str);
            }
        }
        return this.f27439c;
    }
}

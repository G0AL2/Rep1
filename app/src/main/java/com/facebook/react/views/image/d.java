package com.facebook.react.views.image;

import android.graphics.Shader;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import u4.q;

/* compiled from: ImageResizeMode.java */
/* loaded from: classes.dex */
public class d {
    public static Shader.TileMode a() {
        return Shader.TileMode.CLAMP;
    }

    public static q.b b() {
        return q.b.f37551e;
    }

    public static q.b c(String str) {
        if ("contain".equals(str)) {
            return q.b.f37548b;
        }
        if ("cover".equals(str)) {
            return q.b.f37551e;
        }
        if ("stretch".equals(str)) {
            return q.b.f37547a;
        }
        if ("center".equals(str)) {
            return q.b.f37550d;
        }
        if ("repeat".equals(str)) {
            return i.f16121g;
        }
        if (str == null) {
            return b();
        }
        throw new JSApplicationIllegalArgumentException("Invalid resize mode: '" + str + "'");
    }

    public static Shader.TileMode d(String str) {
        if (!"contain".equals(str) && !"cover".equals(str) && !"stretch".equals(str) && !"center".equals(str)) {
            if ("repeat".equals(str)) {
                return Shader.TileMode.REPEAT;
            }
            if (str == null) {
                return a();
            }
            throw new JSApplicationIllegalArgumentException("Invalid resize mode: '" + str + "'");
        }
        return Shader.TileMode.CLAMP;
    }
}

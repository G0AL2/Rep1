package com.bytedance.sdk.component.adexpress.dynamic.c;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DefaultSettingManager.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f9641a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile JSONObject f9642b;

    private c() {
    }

    public static c a() {
        if (f9641a == null) {
            synchronized (c.class) {
                if (f9641a == null) {
                    f9641a = new c();
                }
            }
        }
        return f9641a;
    }

    public JSONObject b() {
        if (f9642b == null) {
            f9642b = c();
        }
        return f9642b;
    }

    public JSONObject c() {
        if (f9642b != null) {
            return f9642b;
        }
        com.bytedance.sdk.component.adexpress.a.a.c c10 = com.bytedance.sdk.component.adexpress.a.a.a.a().c();
        BufferedReader bufferedReader = null;
        Context b10 = c10 != null ? c10.b() : null;
        if (b10 == null) {
            return null;
        }
        AssetManager assets = b10.getAssets();
        StringBuilder sb2 = new StringBuilder();
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(assets.open("dynamic_default.json")));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb2.append(readLine);
                        } catch (Exception e10) {
                            e = e10;
                            bufferedReader = bufferedReader2;
                            e.printStackTrace();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            f9642b = new JSONObject(sb2.toString());
                            return f9642b;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e11) {
                                    e11.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        }
        try {
            f9642b = new JSONObject(sb2.toString());
        } catch (ArrayIndexOutOfBoundsException | JSONException e14) {
            e14.printStackTrace();
        }
        return f9642b;
    }
}

package com.fyber.inneractive.sdk.external;

import android.content.SharedPreferences;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

/* loaded from: classes.dex */
public class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f17179a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f17180b;

    public a(SharedPreferences sharedPreferences, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f17179a = sharedPreferences;
        this.f17180b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        SharedPreferences sharedPreferences = this.f17179a;
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringBuffer = stringWriter.getBuffer().toString();
        if (stringBuffer.contains("com.fyber.inneractive")) {
            sharedPreferences.edit().putString("FyberExceptionKey", stringBuffer).putString("FyberVersionKey", InneractiveAdManager.getVersion()).putString("FyberNameKey", th.getClass().getName()).putString("FyberDescriptionKey", th.getLocalizedMessage()).commit();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f17180b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}

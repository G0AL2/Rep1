package com.apm.insight.l;

import com.apm.insight.nativecrash.NativeImpl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* loaded from: classes.dex */
public class f {
    public static File a(String str, int i10, int i11) {
        File file = new File(o.a(com.apm.insight.h.g(), str), "logcat.txt");
        if (!file.exists() || file.length() <= 0) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException unused) {
            }
            NativeImpl.a(file.getAbsolutePath(), String.valueOf(i10), String.valueOf(i11));
            return file;
        }
        return file;
    }

    public static void a() {
        try {
            a(com.apm.insight.h.f(), com.apm.insight.h.i().getLogcatDumpCount(), com.apm.insight.h.i().getLogcatLevel());
            b();
            d();
            c();
            e();
        } catch (Throwable unused) {
        }
    }

    public static File b() {
        File file = new File(o.e(com.apm.insight.h.g()), "maps.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.f(file.getAbsolutePath());
        return file;
    }

    public static File c() {
        File file = new File(o.e(com.apm.insight.h.g()), "meminfo.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.d(file.getAbsolutePath());
        return file;
    }

    public static File d() {
        File file = new File(o.e(com.apm.insight.h.g()), "fds.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.e(file.getAbsolutePath());
        return file;
    }

    public static File e() {
        File file = new File(o.e(com.apm.insight.h.g()), "threads.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.g(file.getAbsolutePath());
        return file;
    }

    public static File f() {
        BufferedWriter bufferedWriter;
        File file = new File(o.e(com.apm.insight.h.g()), "anr_trace.txt");
        if (!file.exists() && com.apm.insight.runtime.a.f()) {
            File file2 = new File("/data/anr/traces.txt");
            if (file2.exists()) {
                BufferedReader bufferedReader = null;
                try {
                    file.getParentFile().mkdirs();
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
                    try {
                        bufferedWriter = new BufferedWriter(new FileWriter(file));
                        int i10 = 0;
                        do {
                            try {
                                String readLine = bufferedReader2.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                bufferedWriter.write(readLine);
                                bufferedWriter.write(10);
                                i10 += readLine.length();
                            } catch (IOException unused) {
                                bufferedReader = bufferedReader2;
                                k.a(bufferedReader);
                                k.a(bufferedWriter);
                                return file;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                k.a(bufferedReader);
                                k.a(bufferedWriter);
                                throw th;
                            }
                        } while (i10 < 1048576);
                        k.a(bufferedReader2);
                    } catch (IOException unused2) {
                        bufferedWriter = null;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedWriter = null;
                    }
                } catch (IOException unused3) {
                    bufferedWriter = null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedWriter = null;
                }
                k.a(bufferedWriter);
                return file;
            }
            return file;
        }
        return file;
    }
}

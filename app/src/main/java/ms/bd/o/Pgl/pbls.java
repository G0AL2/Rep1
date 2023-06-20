package ms.bd.o.Pgl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import ms.bd.o.Pgl.pblu;

/* loaded from: classes3.dex */
public class pbls implements pblu.pgla {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class pgla {

        /* renamed from: a  reason: collision with root package name */
        public ZipFile f34554a;

        /* renamed from: b  reason: collision with root package name */
        public ZipEntry f34555b;

        public pgla(ZipFile zipFile, ZipEntry zipEntry) {
            this.f34554a = zipFile;
            this.f34555b = zipEntry;
        }
    }

    private pgla a(Context context, String[] strArr, String str, pblv pblvVar) {
        String[] a10 = a(context);
        int length = a10.length;
        char c10 = 0;
        int i10 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i10 >= length) {
                return null;
            }
            String str2 = a10[i10];
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i11 = i12;
                }
            }
            if (zipFile != null) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (i13 < 5) {
                        int length2 = strArr.length;
                        int i15 = 0;
                        while (i15 < length2) {
                            String str3 = "lib" + File.separatorChar + strArr[i15] + File.separatorChar + str;
                            Object[] objArr = new Object[2];
                            objArr[c10] = str3;
                            objArr[1] = str2;
                            Objects.requireNonNull(pblvVar);
                            String.format(Locale.US, "Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(str3);
                            if (entry != null) {
                                return new pgla(zipFile, entry);
                            }
                            i15++;
                            c10 = 0;
                        }
                        i13 = i14;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i10++;
            c10 = 0;
        }
    }

    private void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private String[] a(Context context) {
        String[] strArr;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (Build.VERSION.SDK_INT < 21 || (strArr = applicationInfo.splitSourceDirs) == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    private String[] a(Context context, String str) {
        Pattern compile = Pattern.compile("lib" + File.separatorChar + "([^\\" + File.separatorChar + "]*)" + File.separatorChar + str);
        HashSet hashSet = new HashSet();
        ZipFile zipFile = null;
        for (String str2 : a(context)) {
            try {
                ZipFile zipFile2 = new ZipFile(new File(str2), 1);
                Enumeration<? extends ZipEntry> entries = zipFile2.entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
                zipFile = zipFile2;
            } catch (IOException unused) {
            }
        }
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public void a(Context context, String[] strArr, String str, File file, pblv pblvVar) {
        String[] strArr2;
        Throwable th;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        pgla pglaVar = null;
        r0 = null;
        Closeable closeable = null;
        try {
            pgla a10 = a(context, strArr, str, pblvVar);
            try {
                if (a10 == null) {
                    try {
                        strArr2 = a(context, str);
                    } catch (Exception e10) {
                        strArr2 = new String[]{e10.toString()};
                    }
                    throw new pblt(str, strArr, strArr2);
                }
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (i10 >= 5) {
                        try {
                            ZipFile zipFile = a10.f34554a;
                            if (zipFile != null) {
                                zipFile.close();
                                return;
                            }
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    String.format(Locale.US, "Found %s! Extracting...", str);
                    try {
                        if (file.exists() || file.createNewFile()) {
                            try {
                                inputStream = a10.f34554a.getInputStream(a10.f34555b);
                            } catch (FileNotFoundException | IOException unused2) {
                                inputStream = null;
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = null;
                            }
                            try {
                                fileOutputStream = new FileOutputStream(file);
                                long j10 = 0;
                                try {
                                    byte[] bArr = new byte[4096];
                                    while (true) {
                                        int read = inputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                        j10 += read;
                                    }
                                    fileOutputStream.flush();
                                    fileOutputStream.getFD().sync();
                                    if (j10 == file.length()) {
                                        a(inputStream);
                                        a(fileOutputStream);
                                        file.setReadable(true, false);
                                        file.setExecutable(true, false);
                                        file.setWritable(true);
                                        try {
                                            ZipFile zipFile2 = a10.f34554a;
                                            if (zipFile2 != null) {
                                                zipFile2.close();
                                                return;
                                            }
                                            return;
                                        } catch (IOException unused3) {
                                            return;
                                        }
                                    }
                                } catch (FileNotFoundException | IOException unused4) {
                                } catch (Throwable th3) {
                                    th = th3;
                                    closeable = fileOutputStream;
                                    a(inputStream);
                                    a(closeable);
                                    throw th;
                                }
                            } catch (FileNotFoundException | IOException unused5) {
                                fileOutputStream = null;
                                a(inputStream);
                                a(fileOutputStream);
                                i10 = i11;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            a(inputStream);
                            a(fileOutputStream);
                        }
                    } catch (IOException unused6) {
                    }
                    i10 = i11;
                }
            } catch (Throwable th5) {
                th = th5;
                pglaVar = a10;
                if (pglaVar != null) {
                    try {
                        ZipFile zipFile3 = pglaVar.f34554a;
                        if (zipFile3 != null) {
                            zipFile3.close();
                        }
                    } catch (IOException unused7) {
                    }
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}

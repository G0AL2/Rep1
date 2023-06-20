package com.ironsource.sdk.utils;

import android.content.Context;
import com.ironsource.environment.h;
import com.ironsource.sdk.h.e;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class IronSourceStorageUtils {

    /* renamed from: a  reason: collision with root package name */
    private static e f28238a;

    private static void a(File file) {
        if (file != null) {
            deleteFolder(b(file).getPath());
        }
    }

    private static File b(File file) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getAbsolutePath());
        String str = File.separator;
        sb2.append(str);
        sb2.append("supersonicads");
        sb2.append(str);
        return new File(sb2.toString());
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + File.separator + str2;
    }

    public static JSONObject buildFilesMap(String str, String str2) {
        Object c10;
        String name;
        Object c11;
        File file = new File(str, str2);
        JSONObject jSONObject = new JSONObject();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                try {
                    c10 = c(file2);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                if (c10 instanceof JSONArray) {
                    name = "files";
                    c11 = c(file2);
                } else if (c10 instanceof JSONObject) {
                    name = file2.getName();
                    c11 = c(file2);
                }
                jSONObject.put(name, c11);
            }
        }
        return jSONObject;
    }

    public static JSONObject buildFilesMapOfDirectory(com.ironsource.sdk.h.c cVar, JSONObject jSONObject) {
        String name;
        JSONObject buildFilesMapOfDirectory;
        if (cVar == null || !cVar.isDirectory()) {
            return new JSONObject();
        }
        File[] listFiles = cVar.listFiles();
        if (listFiles == null) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        for (File file : listFiles) {
            com.ironsource.sdk.h.c cVar2 = new com.ironsource.sdk.h.c(file.getPath());
            if (cVar2.isFile()) {
                name = cVar2.getName();
                buildFilesMapOfDirectory = cVar2.a();
                if (jSONObject.has(name)) {
                    buildFilesMapOfDirectory = SDKUtils.mergeJSONObjects(buildFilesMapOfDirectory, jSONObject.getJSONObject(name));
                }
            } else if (cVar2.isDirectory()) {
                name = cVar2.getName();
                buildFilesMapOfDirectory = buildFilesMapOfDirectory(cVar2, jSONObject);
            }
            jSONObject2.put(name, buildFilesMapOfDirectory);
        }
        return jSONObject2;
    }

    private static Object c(File file) {
        File[] listFiles;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        if (file.isFile()) {
            jSONArray.put(file.getName());
            return jSONArray;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                jSONObject.put(file2.getName(), c(file2));
            } else {
                jSONArray.put(file2.getName());
                jSONObject.put("files", jSONArray);
            }
        }
        return jSONObject;
    }

    public static void deleteCacheDirectories(Context context) {
        a(h.r(context));
        a(h.t(context));
    }

    public static synchronized boolean deleteFile(com.ironsource.sdk.h.c cVar) {
        synchronized (IronSourceStorageUtils.class) {
            if (cVar.exists()) {
                return cVar.delete();
            }
            return false;
        }
    }

    public static void deleteFilesDirectories(Context context) {
        a(h.s(context));
        a(h.u(context));
    }

    public static synchronized boolean deleteFolder(String str) {
        boolean z10;
        synchronized (IronSourceStorageUtils.class) {
            File file = new File(str);
            if (deleteFolderContentRecursive(file)) {
                z10 = file.delete();
            }
        }
        return z10;
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] listFiles = file.listFiles();
        boolean z10 = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z10 &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    public static String getCachedFilesMap(String str, String str2) {
        JSONObject buildFilesMap = buildFilesMap(str, str2);
        try {
            buildFilesMap.put("path", str2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return buildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        if (SDKUtils.isExternalStorageAvailable()) {
            e eVar = f28238a;
            File s10 = (eVar == null || !eVar.a()) ? h.s(context) : h.r(context);
            if (s10 != null && s10.canWrite()) {
                return s10.getPath();
            }
        }
        e eVar2 = f28238a;
        return ((eVar2 == null || !eVar2.a()) ? h.u(context) : h.t(context)).getPath();
    }

    public static ArrayList<com.ironsource.sdk.h.c> getFilesInFolderRecursive(com.ironsource.sdk.h.c cVar) {
        if (cVar == null || !cVar.isDirectory()) {
            return new ArrayList<>();
        }
        ArrayList<com.ironsource.sdk.h.c> arrayList = new ArrayList<>();
        File[] listFiles = cVar.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                com.ironsource.sdk.h.c cVar2 = new com.ironsource.sdk.h.c(file.getPath());
                if (cVar2.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(cVar2));
                }
                if (cVar2.isFile()) {
                    arrayList.add(cVar2);
                }
            }
        }
        return arrayList;
    }

    public static String getNetworkStorageDir(Context context) {
        File b10 = b(new File(getDiskCacheDirPath(context)));
        if (!b10.exists()) {
            b10.mkdir();
        }
        return b10.getPath();
    }

    public static long getTotalSizeOfDir(com.ironsource.sdk.h.c cVar) {
        long totalSizeOfDir;
        long j10 = 0;
        if (cVar != null && cVar.isDirectory()) {
            File[] listFiles = cVar.listFiles();
            if (listFiles == null) {
                return 0L;
            }
            for (File file : listFiles) {
                com.ironsource.sdk.h.c cVar2 = new com.ironsource.sdk.h.c(file.getPath());
                if (cVar2.isFile()) {
                    totalSizeOfDir = cVar2.length();
                } else if (cVar2.isDirectory()) {
                    totalSizeOfDir = getTotalSizeOfDir(cVar2);
                }
                j10 += totalSizeOfDir;
            }
        }
        return j10;
    }

    public static void initializeCacheDirectory(Context context, e eVar) {
        f28238a = eVar;
        if (eVar != null && eVar.f28198a.optBoolean("deleteCacheDir", false)) {
            deleteCacheDirectories(context);
        }
        e eVar2 = f28238a;
        if (eVar2 == null || !eVar2.f28198a.optBoolean("deleteFilesDir", false)) {
            return;
        }
        deleteFilesDirectories(context);
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static String readFile(com.ironsource.sdk.h.c cVar) {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(cVar));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return sb2.toString();
            }
            sb2.append(readLine);
            sb2.append('\n');
        }
    }

    public static boolean renameFile(String str, String str2) {
        return new File(str).renameTo(new File(str2));
    }

    public static int saveFile(byte[] bArr, String str) {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[102400];
            int i10 = 0;
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read == -1) {
                    return i10;
                }
                fileOutputStream.write(bArr2, 0, read);
                i10 += read;
            }
        } finally {
            fileOutputStream.close();
            byteArrayInputStream.close();
        }
    }
}

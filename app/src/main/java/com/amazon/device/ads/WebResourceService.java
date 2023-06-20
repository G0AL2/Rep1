package com.amazon.device.ads;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/* loaded from: classes.dex */
class WebResourceService implements Runnable {
    private static final long REFRESH_INTERVAL = 86400000;
    private static final String WEB_DIR = "/mdtb_web/";
    private static WebResourceService theService;
    private static final String LOG_TAG = WebResourceService.class.getSimpleName();
    private static boolean inProgress = false;

    WebResourceService() {
    }

    private void createWebDirIfNeeded() {
        File filesDir = AdRegistration.getContext().getFilesDir();
        File file = new File(filesDir.getAbsolutePath() + WEB_DIR);
        if (file.isDirectory() || file.exists()) {
            return;
        }
        file.mkdir();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WebResourceService getInstance() {
        if (theService == null) {
            theService = new WebResourceService();
        }
        return theService;
    }

    public static void init() {
        try {
            if (inProgress) {
                return;
            }
            WebResourceService webResourceService = getInstance();
            Long webResoucesLastPing = DtbSharedPreferences.getInstance().getWebResoucesLastPing();
            if (webResoucesLastPing == null || new Date().getTime() - webResoucesLastPing.longValue() > REFRESH_INTERVAL) {
                inProgress = true;
                DtbThreadService.getInstance().execute(webResourceService);
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute init method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute init method", e10);
        }
    }

    private synchronized void renameTo(File file, File file2) {
        file.renameTo(file2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void deleteWebDirContent() {
        File filesDir = AdRegistration.getContext().getFilesDir();
        File file = new File(filesDir.getAbsolutePath() + WEB_DIR);
        if (file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                file2.delete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String loadFile(String str) throws IOException {
        File filesDir = AdRegistration.getContext().getFilesDir();
        File file = new File(filesDir.getAbsolutePath() + WEB_DIR + str + ".js");
        if (!file.exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                fileInputStream.close();
                return sb2.toString();
            }
            sb2.append(readLine.trim());
            sb2.append("\n");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String[] cDNResources;
        DtbHttpClient dtbHttpClient;
        File filesDir;
        try {
            createWebDirIfNeeded();
            boolean z10 = true;
            for (String str : WebResourceOptions.getCDNResources()) {
                try {
                    dtbHttpClient = new DtbHttpClient(WebResourceOptions.getCDNHost() + str);
                    dtbHttpClient.setUseSecure(DtbDebugProperties.getIsSecure(true));
                    dtbHttpClient.executeGET(60000);
                } catch (Exception e10) {
                    DtbLog.error("Error registering device for ads:" + e10.toString());
                    z10 = false;
                }
                if (dtbHttpClient.getResponseCode() == 200) {
                    String response = dtbHttpClient.getResponse();
                    File createTempFile = File.createTempFile("dtb-temp", "js", AdRegistration.getContext().getFilesDir());
                    FileWriter fileWriter = new FileWriter(createTempFile);
                    fileWriter.write(response);
                    fileWriter.close();
                    renameTo(createTempFile, new File(filesDir.getAbsolutePath() + WEB_DIR + str));
                } else {
                    throw new RuntimeException("resource " + str + " not available");
                    break;
                }
            }
            if (z10) {
                DtbSharedPreferences.getInstance().saveWebResoucesLastPing(new Date().getTime());
            }
            inProgress = false;
        } catch (RuntimeException e11) {
            DtbLog.error(LOG_TAG, "Fail to execute init method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute init method", e11);
        }
    }
}

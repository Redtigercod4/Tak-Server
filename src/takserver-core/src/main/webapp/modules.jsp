<%@ page import="java.io.File" %>
<%@ page contentType="application/javascript" %>
<%
    String corePath = application.getRealPath("/core");
    File coreDir = new File(corePath);

    String[] moduleNames = coreDir.list((dir, name) -> new File(dir, name).isDirectory());

    StringBuilder jsResponse = new StringBuilder("window.moduleFolders = [");
    for (int i = 0; i < moduleNames.length; i++) {
        jsResponse.append("\"").append(moduleNames[i]).append("\"");
        if (i < moduleNames.length - 1) {
            jsResponse.append(",");
        }
    }
    jsResponse.append("];");

    out.print(jsResponse.toString());
%>
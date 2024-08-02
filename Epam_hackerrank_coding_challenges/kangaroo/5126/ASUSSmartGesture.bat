
call "%~dp0install.bat" 

set RegPath=HKEY_LOCAL_MACHINE\SOFTWARE\Wow6432Node\Microsoft\Windows\CurrentVersion\Uninstall\{4D3286A6-F6AB-498A-82A4-E4F040529F3D}
Set ApName=ASUSSmartGesture.reg

reg export "%RegPath%" "%~dp0%ApName%"
notepad "%~dp0%ApName%"
del "%~dp0%ApName%"

pause

rem C:\windows\system32>reg query HKLM\Software\ASUS\ICEpower_APO /v "Display Version"
rem HKEY_LOCAL_MACHINE\Software\ASUS\ICEpower_APO
rem    Display Version    REG_SZ    1.32.180307

rem reg query "%RegPath%" /v "Display Version" > "%~dp0%ApName%" 
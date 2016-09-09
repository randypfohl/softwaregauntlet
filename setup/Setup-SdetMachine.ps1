<<<<<<< HEAD
(new-object Net.WebClient).DownloadString("http://psget.net/GetPsGet.ps1") | iex;
Install-Module posh-git;
if (-Not (Test-Path $profile)){New-Item -Path $profile -Type file -Force -Confirm:$false};
"#  Load posh-git example profile" | Out-File $profile -Append;
". $([Environment]::GetFolderPath(`"MyDocuments`"))\WindowsPowerShell\Modules\posh-git\profile.example.ps1" | Out-File $profile -Append;
$javaConfirmation = & "$env:JAVA_HOME\bin\java" -version 2>&1;
if ($javaConfirmation -like "*error*"){
    Write-Host "Latest Java JDK must be installed; terminating execution"
    Return;
};
=======
(new-object Net.WebClient).DownloadString("http://psget.net/GetPsGet.ps1") | iex
>>>>>>> 1f63679cc269d2d9c4ba6b4dc74074327f7db4cb

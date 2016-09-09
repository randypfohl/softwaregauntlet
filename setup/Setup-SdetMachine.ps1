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
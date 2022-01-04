Clear-Host
Write-Host "********************Starting here********************"
$files = Get-ChildItem -Path "D:\DSA\PepCodingQuestionsandAnswers"
$count = 1
$selectedFolder = "Topic_09_RecursionWithArrayList"


foreach ($f in $files) {
    $type = $f.GetType();    
    if ($type -eq [System.IO.DirectoryInfo] ) {        
        $name = $f.Name;
        $isSelect = $name -eq $selectedFolder
        # $isSelect = $true
        
        if ($isSelect) {
            Write-Host $name
            Powershell.exe -File "D:\DSA\PepCodingQuestionsandAnswers\PowerShell\Txt To Pdf.ps1" -logs $count -folderPath $f -pdfOrWordName $name
            $count++     
        }
    }
}

# start "D:\DSA\PepCodingQuestionsandAnswers\Code Prints\PDF's\"
# start "D:\DSA\PepCodingQuestionsandAnswers\Code Prints\PDF's\Topic_04_Arrays.pdf"
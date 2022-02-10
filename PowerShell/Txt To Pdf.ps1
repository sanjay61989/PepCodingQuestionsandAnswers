Param
(
  [string]$logs,
  [string]$folderPath,
  [string]$pdfOrWordName
)
Write-Host $logs
$folderPath = $folderPath + "\*.java"
Write-Host $folderPath
# $pdfPath = "D:\DSA\PepCodingQuestionsandAnswers\Code Prints\PDF's\" + $pdfOrWordName + ".pdf"
# $docPath = "D:\DSA\PepCodingQuestionsandAnswers\Code Prints\Docs\" + $pdfOrWordName + ".docx"
$pdfPath = "D:\DSA\PepCodingQuestionsandAnswers\" + $pdfOrWordName + "\" + $pdfOrWordName + ".pdf"
$docPath = "D:\DSA\PepCodingQuestionsandAnswers\" + $pdfOrWordName + "\" + $pdfOrWordName + ".docx"
Write-Host $pdfPath
Write-Host $docPath

# return
$pdfPath = $pdfPath;
# $pdfPath = "D:\DSA\PepCodingQuestionsandAnswers\Prints\test.pdf"

$files = Get-ChildItem -Path $folderPath
# $files = Get-ChildItem -Path "D:\DSA\PepCodingQuestionsandAnswers\Topic_01_GettingStartedBasics\*.java"
$count = 0;
# Create a hidden Word window
$word = New-Object -ComObject word.application
$word.visible = $false

# Add a Word document
$doc = $word.documents.add()
if ($files.Count -gt 0) {
  foreach ($file in $files) {

    $txtPath = $file
    Write-Host $txtPath
    # Required Word Variables
    $wdExportFormatPDF = 17

    # Put the text into the Word document
    $txt = Get-Content $txtPath -Raw
    $selection = $word.selection
    $selection.typeText("Code : " + ($count + 1))
    $selection.TypeText("`v")
    $selection.TypeText($txt)
    # $selection.InsertFile($txtPath)
    $selection.InsertNewPage()
    $count++;
  }
  
  Write-Host $count


  $selection.WholeStory()
  $selection.Style = "No Spacing"


  # Set the page orientation to landscape
  $doc.PageSetup.Orientation = 0
  $doc.PageSetup.TopMargin = 30
  $doc.PageSetup.BottomMargin = 1
  $doc.PageSetup.LeftMargin = 40
  $doc.PageSetup.RightMargin = 10
  # Export the PDF file and close without saving a Word document
  $doc.ExportAsFixedFormat($pdfPath, $wdExportFormatPDF)
  # $filename = "D:\DSA\PepCodingQuestionsandAnswers\Prints\test.docx"
  $filename = $docPath;
  $doc.SaveAs([REF]$filename)
  $doc.close();
  # $doc.close([ref]$wdDoNotSaveChanges)

  $word.Quit()
}
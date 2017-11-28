package test.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class WebTable {

	 private WebElement _webTable;

	  public WebTable(WebElement webTable)
	  {
	    set_webTable(webTable);
	  }

	  public WebElement get_webTable() {
	    return _webTable;
	  }

	  public void set_webTable(WebElement webTable) {
		  this._webTable = webTable;
	  }

	  public int getRowCount() {
		  List<WebElement> tableRows = _webTable.findElements(By.tagName("tr"));
		  return tableRows.size();
	  }
	  
	  public int getColumnCount(int Row) {
		  List<WebElement> tableRows = _webTable.findElements(By.tagName("tr"));
		  WebElement headerRows = tableRows.get(Row);
		  
		  List<WebElement> tableCols = headerRows.findElements(By.tagName("td"));
		  return tableCols.size();
	  }
	  
	  public String getCellData(int row, int col) {
		  List<WebElement> tableRows = _webTable.findElements(By.tagName("tr"));
		  WebElement currentRow = tableRows.get(row-1);
		  List<WebElement> tableCols = currentRow.findElements(By.tagName("td"));
		  WebElement cell = tableCols.get(col-1);
		  return cell.getText();
	  }
	  
	  public WebElement getCellEditor(int row, int col) throws NoSuchElementException{
		  try {
			  List<WebElement> tableRows = _webTable.findElements(By.tagName("tr"));
			  WebElement currentRow = tableRows.get(row-1);
			  List<WebElement> tableCols = currentRow.findElements(By.tagName("td"));
			  WebElement cell = tableCols.get(col-1);
			  WebElement cellEditor = cell.findElement(By.tagName("input"));
			  return cellEditor;
		  }
		  catch(NoSuchElementException e) {
			  throw new NoSuchElementException("Failed to get Cell Editor");
		  }
		 
	  }
	  
	  
	  public WebElement getCell(int row, int col,String tagnm) throws NoSuchElementException{
		  try {
			  List<WebElement> tableRows = _webTable.findElements(By.tagName("tr"));
			  WebElement currentRow = tableRows.get(row-1);
			  List<WebElement> tableCols = currentRow.findElements(By.tagName("td"));
			  WebElement cell = tableCols.get(col-1);
			  return cell.findElement(By.tagName(tagnm));
		  }
		  catch(NoSuchElementException e) {
			  throw new NoSuchElementException("Failed to get Cell");
		  }
	  
	  }  
	  
	  
	  public WebElement getCel(int row, int col) throws NoSuchElementException{
		  try {
			  List<WebElement> tableRows = _webTable.findElements(By.tagName("tr"));
			  WebElement currentRow = tableRows.get(row-1);
			  List<WebElement> tableCols = currentRow.findElements(By.tagName("td"));
			  WebElement cell = tableCols.get(col-1);
			  return cell;
		  }
		  catch(NoSuchElementException e) {
			  throw new NoSuchElementException("Failed to get Cell");
		  }
	  
	  }  
}

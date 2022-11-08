package doc

import java.io.{FileNotFoundException, IOException}

def runTryCatchFinally(): Unit =
  try
    println("Try to do something")
  catch
    case fnf: FileNotFoundException => fnf.printStackTrace()
    case ioe: IOException => ioe.printStackTrace()
  finally
    // close your resources here
    println("Came to the 'finally' clause.")
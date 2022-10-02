import java.net.URI;
import java.awt.Desktop;
import edu.cmu.sphinx.api.*;
import java.io.ObjectInputFilter.Config;
public class App {
    
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Configuration config = new Configuration();
        config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        config.setDictionaryPath("src\\dic.dic");
        config.setLanguageModelPath("src\\lm.lm");
        try {
            LiveSpeechRecognizer rec = new LiveSpeechRecognizer(config);
            rec.startRecognition(true);
            Desktop desk = Desktop.getDesktop();
            while (rec.getResult() != null) {
                String result = rec.getResult().getHypothesis();
                //GOOGLE
                if (result.toLowerCase().equals("google")){
                    System.out.println("Opening: "+result);
                    URI uri = new URI("http://google.com/");
                    desk.browse(uri);
               }else if(result.toLowerCase().equals("close google")){
                System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM msedge.exe");
                //GOOGLE
                     //YOUTUBE
                        }else if(result.toLowerCase().equals("youtube")){
                            System.out.println("Opening: "+result);
                                 URI uri = new URI("http://youtube.com/");
                                 desk.browse(uri);
                        }else if(result.toLowerCase().equals("close youtube")){
                            System.out.println("Opening: "+result);
                                 Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM msedge.exe");
                     //YOUTUBE
                //FACEBOOK
                }else if(result.toLowerCase().equals("facebook")){
                    System.out.println("Opening: "+result);
                    URI uri = new URI("http://facebook.com/"); 
                }else if(result.toLowerCase().equals("close facebook")){
                    System.out.println("Opening: "+result);
                        Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM msedge.exe");
                //FACEBOOK
                    //GMAIL
                        }else if(result.toLowerCase().equals("gmail")){
                            System.out.println("Opening: "+result);
                                URI uri = new URI("https://gmail.com/");
                                desk.browse(uri);
                        }else if(result.toLowerCase().equals("close gmail")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM msedge.exe");
                    //GMAIL
                //INSTAGRAM
                }else if(result.toLowerCase().equals("instagram")){
                    System.out.println("Opening: "+result);
                    URI uri = new URI("http://instagram.com/");
                    desk.browse(uri);
                }else if(result.toLowerCase().equals("close instagram")){
                    System.out.println("Opening: "+result);
                        Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM msedge.exe");
                //INSTAGRAM
                    //SKYPE
                        }else if(result.toLowerCase().equals("skype")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c start skype.exe");
                        }else if(result.toLowerCase().equals("close skype")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM skype.exe");
                    //SKYPE
                //MAPS
                }else if(result.toLowerCase().equals("maps")){
                    System.out.println("Opening: "+result);
                    URI uri = new URI("https://www.google.com/maps/");
                    desk.browse(uri);
                }else if(result.toLowerCase().equals("close maps")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM msedge.exe");
                //MAPS
                    //ZOOM
                        }else if(result.toLowerCase().equals("zoom")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c start zoom.exe");
                        }else if(result.toLowerCase().equals("close zoom")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM zoom.exe");
                    //ZOOM
                //DRIVE
                }else if(result.toLowerCase().equals("drive")){
                    System.out.println("Opening: "+result);
                    URI uri = new URI("http://drive.com/");
                    desk.browse(uri);
                }else if(result.toLowerCase().equals("close drive")){
                    System.out.println("Opening: "+result);
                        Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM msedge.exe");
                //DRIVE
                    //FLIPKART
                        }else if(result.toLowerCase().equals("flipkart")){
                            System.out.println("Opening: "+result);
                                URI uri = new URI("https://flipkart.com/");
                                desk.browse(uri);
                        }else if(result.toLowerCase().equals("close flipkart")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM msedge.exe");
                    //FLIPKART
                //AMAZON
                }else if(result.toLowerCase().equals("amazon")){
                    System.out.println("Opening: "+result);
                    URI uri = new URI("https://amazon.com/");
                    desk.browse(uri);
                }else if(result.toLowerCase().equals("close amazon")){
                    System.out.println("Opening: "+result);
                        Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM msedge.exe");
                //AMAZON
                    //WHATSAPP
                        }else if(result.toLowerCase().equals("webwhatsapp")){
                            System.out.println("Opening: "+result);
                                URI uri = new URI("https://web.whatsapp.com/");
                                desk.browse(uri);
                        }else if(result.toLowerCase().equals("close webwhatsapp")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM msedge.exe");
                    //WHATSAPP
                //UDEMY
                }else if(result.toLowerCase().equals("udemy")){
                    System.out.println("Opening: "+result);
                    URI uri = new URI("https://udemy.com/");
                    desk.browse(uri);
                }else if(result.toLowerCase().equals("close udemy")){
                    System.out.println("Opening: "+result);
                        Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM msedge.exe");
                //UDEMY
                    //CURSA
                        }else if(result.toLowerCase().equals("cursa")){
                            System.out.println("Opening: "+result);
                                URI uri = new URI("https://cursa.com/");
                                desk.browse(uri);
                        }else if(result.toLowerCase().equals("close cursa")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM msedge.exe");
                    //CURSA
                //GOOGLE ACCOUNT
                }else if(result.toLowerCase().equals("myaccountgoogle")){
                    System.out.println("Opening: "+result);
                    URI uri = new URI("https://myaccount.google.com/?utm_source=sign_in_no_continue&pli=1");
                    desk.browse(uri);
                }else if(result.toLowerCase().equals("close myaccountgoogle")){
                    System.out.println("Opening: "+result);
                        Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM msedge.exe");
                //GOOGLE ACCOUNT
                    //NOTEPAD
                        }else if(result.toLowerCase().equals("notepad")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c start notepad.exe");
                        }else if(result.toLowerCase().equals("close notepad")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM notepad.exe");
                    //NOTEPAD
                //BRAVE
                }else if(result.toLowerCase().equals("brave")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c start brave.exe");
                }else if(result.toLowerCase().equals("close brave")){
                    System.out.println("Opening: "+result);
                        Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM brave.exe");
                //BRAVE
                    //POERPOINT
                        }else if(result.toLowerCase().equals("powerpoint")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c start powerpnt.exe");
                        }else if(result.toLowerCase().equals("close powerpoint")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM powerpnt.exe");
                    //POWERPOINT
                //OFFICE
                }else if(result.toLowerCase().equals("office")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c start msoffice.exe");
                } else if(result.toLowerCase().equals("close office")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM msoffice.exe");
                //OFFICE
                    //WORD
                        }else if(result.toLowerCase().equals("word")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c start winword.exe");
                        }else if(result.toLowerCase().equals("close word")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM winword.exe");
                    //WORD
                //EXPLORER    
                }else if(result.toLowerCase().equals("explorer")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c start explorer");
                } else if(result.toLowerCase().equals("close explorer")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM explorer");
                //EXPLORER
                    //SETTINGS
                        }else if(result.toLowerCase().equals("settings")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c start control.exe");
                        }else if(result.toLowerCase().equals("close settings")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM control.exe");
                    //SETTINGS
                //PAINT
                }else if(result.toLowerCase().equals("paint")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c start mspaint.exe");
                }else if(result.toLowerCase().equals("close paint")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM mspaint.exe");
                //PAINT
                    //CMD
                        }else if(result.toLowerCase().equals("command prompt")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c start cmd.exe");
                        }else if(result.toLowerCase().equals("close command prompt")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM cmd.exe");
                    //CMD
                //ACCESS
                }else if(result.toLowerCase().equals("access")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c start MSACCESS.EXE");
                } else if(result.toLowerCase().equals("close access")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM MSACCESS.EXE");
                //ACCESS
                    //ONENOTE
                        }else if(result.toLowerCase().equals("onenote")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c start onenote.exe");
                        }else if(result.toLowerCase().equals("close onenote")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM onenote.exe");
                    //ONENOTE
                //OUTLOOK
                }else if(result.toLowerCase().equals("outlook")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c start outlook.exe");
                } else if(result.toLowerCase().equals("close outlook.exe")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM outlook.exe");
                //OUTLOOK
                    //EXCEL
                        }else if(result.toLowerCase().equals("excel")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c start excel.exe");
                        }else if(result.toLowerCase().equals("close excel")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM excel.exe");
                    //EXCEL
                //PUBLISHER
                }else if(result.toLowerCase().equals("publisher")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c start mspub.exe");
                }else if(result.toLowerCase().equals("close publisher")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM mspub.exe");
                //PUBLISHER
                    //EDGE
                        }else if(result.toLowerCase().equals("edge")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c start msedge.exe");
                        }else if(result.toLowerCase().equals("close edge")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM msedge.exe");
                    //EDGE
                //ADOBE
                }else if(result.toLowerCase().equals("adobe")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c start acrobat.exe");
                } else if(result.toLowerCase().equals("close adobe")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM acrobat.exe");
                //ADOBE
                    //WORDPAD
                        }else if(result.toLowerCase().equals("wordpad")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c start wordpad.exe");
                        }else if(result.toLowerCase().equals("close wordpad")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM wordpad.exe");
                    //WORDPAD
                //PLAYER
                }else if(result.toLowerCase().equals("player")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c start wmplayer.exe");
                }else if(result.toLowerCase().equals("close player")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM wmplayer.exe");
                //PLAYER
                    //MATH
                        }else if(result.toLowerCase().equals("math")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c start mip.exe");
                        }else if(result.toLowerCase().equals("close math")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM mip.exe");
                    //MATH
                //RECORDER
                }else if(result.toLowerCase().equals("recorder")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c start psr.exe");
                }else if(result.toLowerCase().equals("close recorder")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM psr.exe");
                //RECORDER
                    //TASK MANAGER
                        }else if(result.toLowerCase().equals("task manager")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c start tskmgr.exe");
                        }else if(result.toLowerCase().equals("close task manager")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM tskmgr.exe");
                    //TASK MANAGER
                //PHOTOS
                }else if(result.toLowerCase().equals("photos")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c start Photo.exe");
                }else if(result.toLowerCase().equals("close photos")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM Photo.exe");
                //PHOTOS
                    //NHCE
                        }else if(result.toLowerCase().equals("nhce")){
                            System.out.println("Opening: "+result);
                                URI uri = new URI("https://newhorizoncollege.co.in/#");
                                desk.browse(uri);
                        }else if(result.toLowerCase().equals("close site")){
                            System.out.println("Opening: "+result);
                                Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM msedge.exe");
                    //NHCE      
                //SHUTDOWN
                }else if(result.toLowerCase().equals("shutdown")){
                    System.out.println("System will shutdown in 5 seconds ");
                    Runtime.getRuntime().exec("shutdown -s -t 5");
                //SHUTDOWN
                    //RESTART
                        }else if(result.toLowerCase().equals("restart")){
                            System.out.println("Restarting in 5 seconds");
                            Runtime.getRuntime().exec("shutdown -r -t 5");
                    //RESTART
                //AUTOBOT
                }else if(result.toLowerCase().equals("intro")){
                    System.out.println("Opening: "+result);
                    String [] cmds = {"cmd","/c","C:\\AUTOBOT.mp4"};
                    Process p = Runtime.getRuntime().exec(cmds);
                }else if(result.toLowerCase().equals("close intro")){
                    System.out.println("Opening: "+result);
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM wmplayer.exe");
                //AUTOBOT
                    //STUDIO
                    }else if(result.toLowerCase().equals("complier")){
                        System.out.println("Opening: "+result);
                            Runtime.getRuntime().exec("cmd.exe /c start Code.exe");
                    }else if(result.toLowerCase().equals("close complier")){
                        System.out.println("Opening: "+result);
                            Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM Code.exe");
                    //STUDIO
                    }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

